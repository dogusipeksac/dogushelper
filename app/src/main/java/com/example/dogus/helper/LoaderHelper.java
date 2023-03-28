package com.example.dogus.helper;

import com.example.dogus.helper.message.ToastHelper;

public class LoaderHelper {
    private static LoaderHelper instance = null;
    public static LoaderHelper sharedInstance() {
        if (instance == null)
            instance = new LoaderHelper();
        return instance;
    }
}
