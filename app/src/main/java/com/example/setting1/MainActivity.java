package com.example.setting1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open2();

            }
        });
        button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open3();
            }
        });
    }

    public void open2() {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);


    }
    public void open3() {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);

        }

    }
