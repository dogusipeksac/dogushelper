//package com.example.dogus.recyclerview.adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.dogus.databinding.RecyclerItemBinding;
//import com.example.dogus.recyclerview.helper.OnItemClickListener;
//import com.example.dogus.recyclerview.model.Model;
//
//import java.util.ArrayList;
//
//public class RecyclerAdapterVB extends RecyclerView.Adapter<RecyclerAdapterVB.ViewHolder> {
//    private Context context;
//    private ArrayList<Model> modelArrayList;
//    private OnItemClickListener onItemClickListener;
//
//    public RecyclerAdapterVB(Context context, ArrayList<Model> modelArrayList, OnItemClickListener onItemClickListener) {
//        this.context = context;
//        this.modelArrayList = modelArrayList;
//        this.onItemClickListener = onItemClickListener;
//    }
//
//    @NonNull
//    @Override
//    public RecyclerAdapterVB.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return new ViewHolder(RecyclerItemBinding.inflate(LayoutInflater.from(parent.getContext()),
//                parent, false));
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerAdapterVB.ViewHolder holder, int position) {
//        Model model = modelArrayList.get(position);
//        holder.binding.title.setText(model.title);
//        holder.binding.imageview.setImageResource(model.resource);
//        holder.binding.getRoot().setOnClickListener(view -> onItemClickListener.onItemClick(model));
//    }
//
//    @Override
//    public int getItemCount() {
//        return modelArrayList.size();
//    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        public RecyclerItemBinding binding;
//
//        public ViewHolder(RecyclerItemBinding binding) {
//            super(binding.getRoot());
//            this.binding = binding;
//        }
//    }
//}
