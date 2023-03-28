package com.example.dogus.helper.message;

import android.content.Context;
import android.widget.Toast;

public class ToastHelper {
    private static ToastHelper instance = null;
    public static ToastHelper sharedInstance() {
        if (instance == null)
            instance = new ToastHelper();
        return instance;
    }
    public void createToastMessage(String message, Context context){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
