package com.example.setting1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class pop extends Activity {

     Button button3;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        

        setContentView(R.layout.popup);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int witdth= dm.widthPixels;
        int hight= dm.heightPixels;

        getWindow().setLayout((int)(witdth *.8), (int)(hight*.6));


    }
}
