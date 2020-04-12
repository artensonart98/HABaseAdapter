package com.arthur.hritik.habaseadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public abstract class BaseAdapter<T, ViewHolder
        extends BaseViewHolder<T>> extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<T> list;

    public BaseAdapter() {
        list = new ArrayList<>();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(ArrayList<T> list) {
        if (list == null) return;
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public abstract ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType);

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    protected View inflate(@LayoutRes int layoutRes, ViewGroup parent) {
        return LayoutInflater.from(parent.getContext())
                .inflate(layoutRes, parent, false);
    }
}
