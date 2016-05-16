package com.github.mzule.ninegridlayout.sample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.github.mzule.ninegridlayout.AbstractNineGridLayout;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by CaoDongping on 5/13/16.
 */
public class ImageNineGridView extends AbstractNineGridLayout<List<Post.Image>> {
    private ImageView[] imageViews;
    private View[] gifViews;

    public ImageNineGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void fill() {
        fill(R.layout.item_image_grid);
        imageViews = findInChildren(R.id.image, ImageView.class);
        gifViews = findInChildren(R.id.gif, View.class);
    }

    @Override
    public void render(List<Post.Image> images) {
        setSingleModeSize(images.get(0).getWidth(), images.get(0).getHeight());
        setDisplayCount(images.size());
        for (int i = 0; i < images.size(); i++) {
            String url = images.get(i).getUrl();
            Picasso.with(getContext()).load(url).placeholder(R.color.gray).into(imageViews[i]);
            gifViews[i].setVisibility(url.endsWith(".gif") ? VISIBLE : INVISIBLE);
        }
    }
}
