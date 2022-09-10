package com.example.restrauntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SandwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwitch);
        String prices [] = {"15 $","28 $","31 $","18 $", "23 $"};
        String names []= {"American sub","Bacon","Bacon, egg and cheese","Bagel toast","Baked bean"};
        int images [] ={R.drawable.ab,R.drawable.b,R.drawable.bec,R.drawable.bt,R.drawable.bb};
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