package com.vks.iosdialogsdk;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Vishnu Kumar Soni
 * on 18/02/22.
 */

public class iOSDialogBuilder {
    private Typeface tf;
    private boolean bold,cancelable, negativeButtonExist = true;
    private String title, subtitle, okLabel, koLabel;
    private Context context;
    private iOSDialogClickListener positiveListener;
    private iOSDialogClickListener negativeListener;

    public iOSDialogBuilder(Context context) {
        this.context = context;
    }

    public iOSDialogBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public iOSDialogBuilder setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public iOSDialogBuilder setBoldPositiveLabel(boolean bold) {
        this.bold = bold;
        return this;
    }

    public iOSDialogBuilder setFont(Typeface font) {
        this.tf=font;
        return this;
    }
    public iOSDialogBuilder setCancelable(boolean cancelable){
        this.cancelable=cancelable;
        return this;
    }
    public iOSDialogBuilder setNegativeButtonExist(boolean negativeButtonExist){
        this.negativeButtonExist=negativeButtonExist;
        return this;
    }

    public iOSDialogBuilder setNegativeListener(String koLabel,iOSDialogClickListener listener) {
        this.negativeListener=listener;
        this.koLabel=koLabel;
        return this;
    }

    public iOSDialogBuilder setPositiveListener(String okLabel,iOSDialogClickListener listener) {
        this.positiveListener = listener;
        this.okLabel=okLabel;
        return this;
    }

    public iOSDialog build(){
        iOSDialog dialog = new iOSDialog(context,title,subtitle, bold, tf,cancelable);
        dialog.setNegative(koLabel,negativeListener);
        dialog.setPositive(okLabel,positiveListener);
        dialog.setNegativeButtonExist(negativeButtonExist);
        return dialog;
    }
    public iOSDialog buildSingleButtonDialog(){
        iOSDialog dialog = new iOSDialog(context,title,subtitle, bold, tf,cancelable);
        dialog.setNegative(koLabel,negativeListener);
        dialog.setNegativeButtonExist(negativeButtonExist);
        return dialog;
    }

}