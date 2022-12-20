package com.example.setting1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView = findViewById(R.id.listview);
        List<String>list=new ArrayList<>();
        list.add("Lunges");
        list.add("Push-ups");
        list.add("Squats");
        list.add("Standing overhead dumbbell presses");
        list.add("Dumbbell rows");
        list.add("Single-leg dead lifts");
        list.add("Burpees");
        list.add("Side planks");
        list.add("Planks");
        list.add("Glut bridge");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent , View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(MainActivity2.this,Lunges.class));
                }
                else if(position==1){
                    startActivity(new Intent(MainActivity2.this,Pushups.class));

                }
                else if(position==2){
                    startActivity(new Intent(MainActivity2.this,Squats.class));

                }
                else if(position==3){
                    startActivity(new Intent(MainActivity2.this,Standingoverheaddumbbellpresses.class));

                }
                else if(position==4){
                    startActivity(new Intent(MainActivity2.this,Dumbbell_rows.class));


                }
                else if(position==5){
                    startActivity(new Intent(MainActivity2.this,Single_leg_dead_lifts.class));

                }
                else if(position==6){
                    startActivity(new Intent(MainActivity2.this,Burpees.class));

                }
                else if(position==7){
                    startActivity(new Intent(MainActivity2.this,Side_planks.class));

                }
                else if(position==8){
                    startActivity(new Intent(MainActivity2.this,Planks.class));

                }
                else if(position==9){
                    startActivity(new Intent(MainActivity2.this,Glut_bridge.class));

                }


            }

        });



    }
}