package com.example.dogus.webview.view;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dogus.databinding.ActivityWebViewBinding;

public class WebViewActivity extends AppCompatActivity {
    ActivityWebViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebViewBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.webview.setWebViewClient(new WebViewClient());
        binding.webview.loadUrl("https://www.google.com");

    }


    @Override
    public void onBackPressed() {
        //web view için geri butonu
        if (binding.webview.canGoBack()) {
            binding.webview.goBack();
        }else{
            super.onBackPressed();
        }

    }
}