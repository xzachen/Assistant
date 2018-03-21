package com.fedming.bottomnavigationdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fedming.bottomnavigationdemo.Model.Thing;
import com.fedming.bottomnavigationdemo.R;

import butterknife.InjectView;

//笔记的文章适配器写在这！！！
public class ThingRecyclerAdapter extends BaseRecyclerAdapter<Thing> {

    @Override
    public ThingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ThingHolder(view);
    }
//绑定了列表中的子视图R.layout.list_item解析并且绑定视图。

    public class ThingHolder extends BaseRecyclerAdapter<Thing>.ViewHolder {
        @InjectView(R.id.title)
        TextView titleTextView;

        public ThingHolder(View itemView) {
            super(itemView);
        }

        public void populate(Thing item) {
            titleTextView.setText(item.text);
        }
    }
}
