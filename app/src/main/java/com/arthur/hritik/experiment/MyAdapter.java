package com.arthur.hritik.experiment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.arthur.hritik.habaseadapter.BaseAdapter;
import com.arthur.hritik.habaseadapter.BaseViewHolder;

public class MyAdapter extends BaseAdapter<MainActivity.MyItem, MyAdapter.VH> {

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(inflate(R.layout.item_myitem, parent));
    }

    class VH extends BaseViewHolder<MainActivity.MyItem> {
        TextView title, description;

        public VH(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(com.arthur.hritik.habaseadapter.R.id.title);
            description = itemView.findViewById(R.id.description);
        }

        @Override
        public void onBind(MainActivity.MyItem item) {
            title.setText(item.getTitle());
            description.setText(item.getDescription());
        }
    }
}
