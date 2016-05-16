# NineGridLayout

## 功能

类似微博、微信的九宫格图片展示控件，支持单图大图展示，四图四宫格展示，支持指定子视图布局。

![](http://7sbl54.com1.z0.glb.clouddn.com/blog_screenshot.jpg)

## 集成

添加依赖

``` groovy
dependencies {
    compile 'com.github.mzule:ninegridlayout:1.0.1'
}
```

通过继承，创建自己的 `NineGridLayout`

``` java
public class ImageNineGridView extends AbstractNineGridLayout<List<Image>> {
    private ImageView[] imageViews;
    private View[] gifViews;

    @Override
    protected void fill() {
        fill(R.layout.item_image_grid);
        imageViews = findInChildren(R.id.image, ImageView.class); // 在每个 child 里面进行 findViewById(id)，返回数组
        gifViews = findInChildren(R.id.gif, View.class);
    }

    @Override
    public void render(List<Image> images) {
        setSingleModeSize(images.get(0).getWidth(), images.get(0).getHeight()); // 设置单图模式单图大小
        setDisplayCount(images.size()); // 设置展示个数，剩下的隐藏
        for (int i = 0; i < images.size(); i++) {
            String url = images.get(i).getUrl();
            Picasso.with(getContext()).load(url).placeholder(R.color.gray).into(imageViews[i]);
            gifViews[i].setVisibility(url.endsWith(".gif") ? VISIBLE : INVISIBLE);
        }
    }
}
```

在布局里面使用

``` xml
<com.github.mzule.ninegridlayout.sample.ImageNineGridView
        android:id="@+id/imageLayout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="8dp"
        android:layout_marginRight="8dp"
        app:spacing="4dp" />
```

设置数据，进行渲染

``` java
ImageNineGridView imageLayout = findViewById(R.id.imageLayout);
imageLayout.render(data.getImages());
```

## 参数

1. `spacing`: item 之间间距
1. `horizontal_spacing`: item 水平间距
1. `vertical_spacing`: item 垂直间距
1. `single_mode`: 单图大图模式是否开启，默认 true
1. `four_gird_mode`: 四图四宫格模式是否开启，默认 true
1. `single_mode_width`: 单图情况下宽度
1. `single_mode_height`: 单图情况下高度
1. `single_mode_overflow_scale`: 单图情况下，宽度过长是否缩放，默认 true

## 直接使用布局

项目提供了 NineGridLayout 类进行布局支持，如

``` xml
<?xml version="1.0" encoding="utf-8"?>
<com.github.mzule.ninegridlayout.NineGridLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    app:spacing="4dp">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
        
        ...

    <ImageView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:src="@mipmap/ic_launcher" />
        
        ...

    <TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</com.github.mzule.ninegridlayout.NineGridLayout>
```

效果

![](http://7sbl54.com1.z0.glb.clouddn.com/blog_ninelayout_sample.jpg)

## 许可

Apache License 2.0

## 联系我

任何相关问题都可以通过以下方式联系我。

1. 提 issue
1. 新浪微博 http://weibo.com/mzule
1. 个人博客 https://mzule.github.io/
1. 邮件 "mzule".concat("4j").concat("@").concat("gmail.com")
