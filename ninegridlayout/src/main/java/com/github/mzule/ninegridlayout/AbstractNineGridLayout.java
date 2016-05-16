package com.github.mzule.ninegridlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;

/**
 * Created by CaoDongping on 5/11/16.
 */
public abstract class AbstractNineGridLayout<T> extends ViewGroup {
    private static final int MAX_CHILDREN_COUNT = 9;
    private int itemWidth;
    private int itemHeight;
    private int horizontalSpacing;
    private int verticalSpacing;
    private boolean singleMode;
    private boolean fourGridMode;
    private int singleWidth;
    private int singleHeight;
    private boolean singleModeOverflowScale;

    public AbstractNineGridLayout(Context context) {
        this(context, null);
    }

    public AbstractNineGridLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.NineGridLayout);
            int spacing = a.getDimensionPixelSize(R.styleable.NineGridLayout_spacing, 0);
            horizontalSpacing = a.getDimensionPixelSize(R.styleable.NineGridLayout_horizontal_spacing, spacing);
            verticalSpacing = a.getDimensionPixelSize(R.styleable.NineGridLayout_vertical_spacing, spacing);
            singleMode = a.getBoolean(R.styleable.NineGridLayout_single_mode, true);
            fourGridMode = a.getBoolean(R.styleable.NineGridLayout_four_gird_mode, true);
            singleWidth = a.getDimensionPixelSize(R.styleable.NineGridLayout_single_mode_width, 0);
            singleHeight = a.getDimensionPixelSize(R.styleable.NineGridLayout_single_mode_height, 0);
            singleModeOverflowScale = a.getBoolean(R.styleable.NineGridLayout_single_mode_overflow_scale, true);
            a.recycle();
        }
        fill();
    }

    public void setDisplayCount(int count) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setVisibility(i < count ? VISIBLE : GONE);
        }
    }

    public void setSingleModeSize(int w, int h) {
        this.singleWidth = w;
        this.singleHeight = h;
    }

    protected void fill(ViewGetter viewGetter) {
        removeAllViews();
        for (int i = 0; i < MAX_CHILDREN_COUNT; i++) {
            addView(viewGetter.getView(i));
        }
    }

    protected void fill(int layoutId) {
        removeAllViews();
        for (int i = 0; i < MAX_CHILDREN_COUNT; i++) {
            LayoutInflater.from(getContext()).inflate(layoutId, this);
        }
    }

    @SuppressWarnings("unchecked")
    protected <V extends View> V[] findInChildren(int viewId, Class<V> clazz) {
        V[] result = (V[]) Array.newInstance(clazz, getChildCount());
        for (int i = 0; i < result.length; i++) {
            result[i] = (V) getChildAt(i).findViewById(viewId);
        }
        return result;
    }

    protected abstract void fill();

    public abstract void render(T data);

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft() - getPaddingRight();

        int notGoneChildCount = getNotGoneChildCount();

        if (notGoneChildCount == 1 && singleMode) {
            itemWidth = singleWidth > 0 ? singleWidth : widthSize;
            itemHeight = singleHeight > 0 ? singleHeight : widthSize;
            if (itemWidth > widthSize && singleModeOverflowScale) {
                itemWidth = widthSize;
                itemHeight = (int) (widthSize * 1f / singleWidth * singleHeight);
            }
        } else {
            itemWidth = (widthSize - horizontalSpacing * 2) / 3;
            itemHeight = itemWidth;
        }
        measureChildren(MeasureSpec.makeMeasureSpec(itemWidth, MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(itemHeight, MeasureSpec.EXACTLY));

        if (heightMode == MeasureSpec.EXACTLY) {
            setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
        } else {
            notGoneChildCount = Math.min(notGoneChildCount, MAX_CHILDREN_COUNT);
            int height = ((notGoneChildCount - 1) / 3 + 1) * (itemHeight + verticalSpacing) - verticalSpacing + getPaddingTop() + getPaddingBottom();
            setMeasuredDimension(widthMeasureSpec, MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY));
        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int childCount = getChildCount();
        int notGoneChildCount = getNotGoneChildCount();
        int position = 0;
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() == View.GONE) {
                continue;
            }
            int row = position / 3;
            int col = position % 3;

            if (notGoneChildCount == 4 && fourGridMode) {
                row = position / 2;
                col = position % 2;
            }

            int x = col * itemWidth + getPaddingLeft() + horizontalSpacing * col;
            int y = row * itemHeight + getPaddingTop() + verticalSpacing * row;
            child.layout(x, y, x + itemWidth, y + itemHeight);

            position++;
            if (position == MAX_CHILDREN_COUNT) {
                break;
            }
        }
    }

    private int getNotGoneChildCount() {
        int childCount = getChildCount();
        int notGoneCount = 0;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() != View.GONE) {
                notGoneCount++;
            }
        }
        return notGoneCount;
    }
}
