package com.example.dogus.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dogus.R;
import com.example.dogus.recyclerview.helper.OnItemClickListener;
import com.example.dogus.recyclerview.model.Model;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Model> modelArrayList;

    private OnItemClickListener onItemClickListener;

    public RecyclerAdapter(Context context, ArrayList<Model> modelArrayList, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.modelArrayList = modelArrayList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model = modelArrayList.get(position);
        holder.imageView.setImageResource(model.resource);
        holder.title.setText(model.title);
        holder.itemView.setOnClickListener(view -> onItemClickListener.onItemClick(model));

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            title = itemView.findViewById(R.id.title);
        }
    }
}
