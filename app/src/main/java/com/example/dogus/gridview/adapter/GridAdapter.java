package com.example.dogus.gridview.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dogus.R;
import com.example.dogus.gridview.helper.OnItemClickListener;
import com.example.dogus.gridview.model.Model;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    private ArrayList<Model> modelArrayList;
    private Context context;
    private OnItemClickListener onItemClickListener;

    public GridAdapter(ArrayList<Model> modelArrayList, Context context, OnItemClickListener onItemClickListener) {
        this.modelArrayList = modelArrayList;
        this.context = context;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public int getCount() {
        return modelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder") View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gridview, parent, false);
        ImageView imageView = view.findViewById(R.id.imageview);
        TextView title = view.findViewById(R.id.title);

        Model model=modelArrayList.get(position);
        imageView.setImageResource(model.resource);
        title.setText(model.title);
        view.setOnClickListener(view1 -> onItemClickListener.onItemClick(model));

        return view;
    }
}
