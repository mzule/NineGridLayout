package com.github.mzule.ninegridlayout.sample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.github.mzule.easyadapter.SingleTypeAdapter;
import com.github.mzule.easyadapter.ViewType;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tinter.enableIfSupport(this);

        ListView listView = (ListView) findViewById(R.id.listView);
        PostAdapter adapter = new PostAdapter(this);
        adapter.addAndNotify(PostFactory.fake());
        listView.setAdapter(adapter);
    }
}

class PostAdapter extends SingleTypeAdapter<Post> {

    public PostAdapter(Context context) {
        super(context);
    }

    @Override
    protected Class<? extends ViewType> singleViewType() {
        return PostViewType.class;
    }
}

class PostViewType extends ViewType<Post> {
    private TextView msgView;
    private ImageNineGridView imageLayout;

    @Override
    public void onCreate() {
        setContentView(R.layout.item_post);
        imageLayout = findViewById(R.id.imageLayout);
        msgView = findViewById(R.id.msgView);
    }

    @Override
    public void onRender(int position, Post data) {
        imageLayout.render(data.getImages());
        msgView.setText(data.getMsg());
    }
}
