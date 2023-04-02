package com.example.dogus.helper.message;

import android.view.View;

import com.example.dogus.R;
import com.google.android.material.snackbar.Snackbar;

public class SnackbarHelper {
    private static SnackbarHelper instance = null;

    public static SnackbarHelper sharedInstance() {
        if (instance == null)
            instance = new SnackbarHelper();
        return instance;
    }

    public void createSnackBar(String message, View viewMain) {
        //Snackbar.LENGTH_INDEFINITE close basıldıgı zaman kapanmaktadır.
        Snackbar.make(viewMain, message, Snackbar.LENGTH_SHORT).setAction(R.string.Close, view -> {

        }).show();
    }
}
