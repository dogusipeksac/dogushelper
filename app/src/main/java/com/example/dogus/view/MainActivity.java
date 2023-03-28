package com.example.dogus.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.dogus.R;
import com.example.dogus.databinding.ActivityMainBinding;
import com.example.dogus.helper.message.DialogHelper;
import com.example.dogus.helper.message.SnackbarHelper;
import com.example.dogus.helper.message.ToastHelper;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.button.setOnClickListener(view1 -> DialogHelper.sharedInstance().createDialog(MainActivity.this, "MessageTitle", "message", "evet", "hayır"));
    }
}