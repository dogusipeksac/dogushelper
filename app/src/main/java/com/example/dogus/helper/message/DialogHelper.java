package com.example.dogus.helper.message;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

public class DialogHelper {
    private static DialogHelper instance = null;

    public static DialogHelper sharedInstance() {
        if (instance == null)
            instance = new DialogHelper();
        return instance;
    }

    public void createDialog(Context context, String messageTitle, String message, String positiveButtonMessage, String negativeButtonMessage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(messageTitle);
        builder.setMessage(message);
        builder.setNegativeButton(negativeButtonMessage, (dialogInterface, i) -> {
            //negatif için
            dialogInterface.cancel();
        });
        builder.setPositiveButton(positiveButtonMessage, (dialogInterface, i) -> {
            //pozitif için
            ToastHelper.sharedInstance().createToastMessage("Tamamlandı", context);
        });
        builder.show();
        builder.create();
    }
}
