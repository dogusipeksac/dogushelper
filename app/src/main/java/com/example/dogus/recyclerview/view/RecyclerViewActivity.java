package com.example.dogus.recyclerview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.dogus.R;
import com.example.dogus.databinding.ActivityRecyclerViewBinding;
import com.example.dogus.helper.message.ToastHelper;
import com.example.dogus.recyclerview.adapter.Adapter;
import com.example.dogus.recyclerview.adapter.AdapterVB;
import com.example.dogus.recyclerview.helper.OnItemClickListener;
import com.example.dogus.recyclerview.model.Model;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity implements OnItemClickListener {
    ActivityRecyclerViewBinding binding;
    ArrayList<Model> modelArrayList = new ArrayList<>();

    AdapterVB adapterVB;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclerViewBinding.inflate(getLayoutInflater());
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

        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
        adapterVB = new AdapterVB(this, modelArrayList, this::onItemClick);
        binding.recyclerview.setAdapter(adapterVB);
        /*adapter = new Adapter(this, modelArrayList, this::onItemClick);
        binding.recyclerview.setAdapter(adapter);*/

    }

    @Override
    public void onItemClick(Model model) {
        ToastHelper.sharedInstance().createToastMessage("Tıklanan -> " + model.title, this);
    }
}