package com.example.restrauntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        String prices [] = {"150 $","286 $","319 $","180 $", "230 $"};
        String names []= {"Aloo pie","Apple crisp","Apple pie","Bakewell tart","Bacon and egg pie"};
        int images [] ={R.drawable.aloopie,R.drawable.applecrisp,R.drawable.applep,R.drawable.bat,R.drawable.bae};
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