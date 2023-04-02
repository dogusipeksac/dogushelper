package com.example.dogus.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dogus.databinding.RecyclerItemBinding;
import com.example.dogus.recyclerview.helper.OnItemClickListener;
import com.example.dogus.recyclerview.model.Model;

import java.util.ArrayList;

public class AdapterVB extends RecyclerView.Adapter<AdapterVB.ViewHolder> {
    private Context context;
    private ArrayList<Model> modelArrayList;
    private OnItemClickListener onItemClickListener;

    public AdapterVB(Context context, ArrayList<Model> modelArrayList, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.modelArrayList = modelArrayList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public AdapterVB.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(RecyclerItemBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterVB.ViewHolder holder, int position) {
        Model model = modelArrayList.get(position);
        holder.binding.title.setText(model.title);
        holder.binding.imageview.setImageResource(model.resource);
        holder.binding.getRoot().setOnClickListener(view -> onItemClickListener.onItemClick(model));
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerItemBinding binding;

        public ViewHolder(RecyclerItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
