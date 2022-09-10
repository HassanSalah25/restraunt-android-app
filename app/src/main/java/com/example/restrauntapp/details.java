package com.example.restrauntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        ImageView imag = findViewById(R.id.imageView);
        TextView t1 = findViewById(R.id.textdetails1);
        TextView t2 = findViewById(R.id.textdetails2);
        Intent intent = getIntent();
        int image = intent.getIntExtra("image",1);
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");
        imag.setImageResource(image);
        t1.setText(name);
        t2.setText(price);
    }
}