package com.example.dogus.listview.nonecustom.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.dogus.R;
import com.example.dogus.databinding.ActivityListViewBinding;
import com.example.dogus.helper.message.ToastHelper;

public class ListViewActivity extends AppCompatActivity {
    ActivityListViewBinding binding;
    String countries[];
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        //countries= new String[]{"a", "b","c","d","e","f"};
        countries = getResources().getStringArray(R.array.countries);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);
        binding.listview.setAdapter(adapter);

        binding.listview.setOnItemClickListener((adapterView, view1, position, id) -> {
            String countryName = adapterView.getItemAtPosition(position).toString();
            ToastHelper.sharedInstance().createToastMessage(countryName, ListViewActivity.this);
        });

    }
}