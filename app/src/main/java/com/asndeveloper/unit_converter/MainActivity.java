package com.asndeveloper.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView distance,area;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        distance=findViewById(R.id.distanceH);
area=findViewById(R.id.areaunit);
        distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, kmchange.class);
                Toast.makeText(MainActivity.this, "Length Unit Open", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, AreaUnit.class);
                Toast.makeText(MainActivity.this, "Area Unit Open ", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}