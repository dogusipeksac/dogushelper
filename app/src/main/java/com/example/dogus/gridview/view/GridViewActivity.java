package com.example.dogus.gridview.view;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dogus.R;
import com.example.dogus.databinding.ActivityGridViewBinding;
import com.example.dogus.gridview.adapter.GridAdapter;
import com.example.dogus.gridview.helper.OnItemClickListener;
import com.example.dogus.gridview.model.Model;
import com.example.dogus.helper.message.ToastHelper;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity implements OnItemClickListener {
    ActivityGridViewBinding binding;
    ArrayList<Model> modelArrayList = new ArrayList<>();

    GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGridViewBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        modelArrayList.add(new Model("Title", R.drawable.icon));
        modelArrayList.add(new Model("Title1", R.drawable.icon1));
        modelArrayList.add(new Model("Title2", R.drawable.icon2));
        modelArrayList.add(new Model("Title3", R.drawable.icon3));
        modelArrayList.add(new Model("Title4", R.drawable.icon));
        modelArrayList.add(new Model("Title5", R.drawable.icon1));
        modelArrayList.add(new Model("Title6", R.drawable.icon2));
        modelArrayList.add(new Model("Title7", R.drawable.icon3));


        adapter = new GridAdapter(modelArrayList, GridViewActivity.this, this::onItemClick);
        binding.gridview.setAdapter(adapter);

        //binding.gridview.setOnItemClickListener((adapterView, view1, position, l) -> ToastHelper.sharedInstance().createToastMessage("Tıklanan gridItem ->" +modelArrayList.get(position).title, getApplicationContext()));


    }

    @Override
    public void onItemClick(Model model) {
        ToastHelper.sharedInstance().createToastMessage("Tıklanan gridItem ->" + model.title, this);
    }
}