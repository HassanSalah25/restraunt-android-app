package com.example.restrauntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView grill = findViewById(R.id.grill);
        ImageView dessert = findViewById(R.id.desserts);
        ImageView pastries = findViewById(R.id.pastries);
        ImageView sandwitch = findViewById(R.id.sandwitch);
        grill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x =  new Intent(getApplicationContext(),GrillActivity.class);
                startActivity(x);
            }
        });
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x =  new Intent(getApplicationContext(),DessertActivity.class);
                startActivity(x);
            }
        });
        pastries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x =  new Intent(getApplicationContext(),PastriesActivity.class);
                startActivity(x);
            }
        });
        sandwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x =  new Intent(getApplicationContext(),SandwitchActivity.class);
                startActivity(x);
            }
        });
    }
}