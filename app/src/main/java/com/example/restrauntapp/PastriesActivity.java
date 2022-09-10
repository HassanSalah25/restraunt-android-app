package com.example.restrauntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class PastriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastries_activities);
        String prices [] = {"100 $","280 $","119 $","80 $", "20 $"};
        String names []= {"Alexandertorte","Alfajor","Aloo pie","Apple pie","Apple strudel"};
        int images [] ={R.drawable.al,R.drawable.alf,R.drawable.aloo,R.drawable.applepie,R.drawable.apples};
        MyAdapter myadpt = new MyAdapter(names,prices,getApplicationContext(),R.layout.designgrillcard,images);
        ListView list = findViewById(R.id.lv);
        list.setAdapter(myadpt);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent x = new Intent(getApplicationContext(),details.class);
                x.putExtra("image",images[position]);
                x.putExtra("name",names[position]);
                x.putExtra("price",prices[position]);
                startActivity(x);

            }
        });
    }
}