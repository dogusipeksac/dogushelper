package com.example.dogus.scrollview.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.dogus.R;
import com.example.dogus.databinding.ActivityRecyclerViewBinding;
import com.example.dogus.databinding.ActivityScrollViewBinding;

public class ScrollViewActivity extends AppCompatActivity {
    ActivityScrollViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScrollViewBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}