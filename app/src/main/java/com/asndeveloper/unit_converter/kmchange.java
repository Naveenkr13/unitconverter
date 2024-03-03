package com.asndeveloper.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class kmchange extends AppCompatActivity {
EditText ValueEnter;
Spinner spinner;
TextView km,m,cm,milim,microm,nanom,mile,yard,ft,in;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmchange);

        ValueEnter=findViewById(R.id.edtValue);
        spinner=findViewById(R.id.spin);
        km=findViewById(R.id.kilometer);
        m=findViewById(R.id.meter);
        cm=findViewById(R.id.centimeter);
        milim=findViewById(R.id.milimeter);
        microm=findViewById(R.id.micrometer);
        nanom=findViewById(R.id.nanometer);
        mile=findViewById(R.id.miles);
        yard=findViewById(R.id.yards);
        ft=findViewById(R.id.foots);
        in=findViewById(R.id.inch);

        //step 1
        String[] array={"km","m","cm","milim","microm","namom","mile","yard","ft","in"};
        spinner.setAdapter(new ArrayAdapter(kmchange.this, android.R.layout.simple_list_item_1,array));

        //step2
        ValueEnter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                //step 3
                updatetxt();
            }
        });


    }

    //step 3 method create
    private void updatetxt() {
    if (!ValueEnter.getText().toString().equals("") &&!spinner.getSelectedItem().toString().equals("")){
        double integerValu=Double.parseDouble(ValueEnter.getText().toString());
        switch(spinner.getSelectedItem().toString()){
            //here we converted units using seleceted value in spinner that i store in array
            //km
//            yaha pe km ka value show hoga pura case me
            case"km":
                //create method ValueKm
                ShowValueKm(integerValu);
                break;

                //meter
            case "m":
                ShowValueKm(integerValu/1000);
                break;
            //centimeter
            case "cm":
                ShowValueKm(integerValu/100000);
                break;
            //milimeter

            case "milim":
                ShowValueKm(integerValu/1000000);
                break;
                //micrometer
            case "microm":
                ShowValueKm(integerValu/1000000000);
                break;
            case "namom":
                double d=100000*1000000;
                ShowValueKm(integerValu/d);
                break;
            case "mile":
                ShowValueKm(integerValu*1.609);
                break;
            case "yard":
                ShowValueKm(integerValu/1094);
                break;
            case "ft":
                ShowValueKm(integerValu/3281);
                break;
            case "in":
                ShowValueKm(integerValu/39370);
                break;
        }
    }
    }
    //step 4
    private void ShowValueKm(double integerValu) {
km.setText(String.valueOf(integerValu));
 m.setText(String.valueOf(integerValu*1000));
 cm.setText(String.valueOf(integerValu*100000));
 milim.setText(String.valueOf(integerValu*1000000));
 microm.setText(String.valueOf(integerValu*1000000000));
 nanom.setText(String.valueOf(integerValu*100000*1000000));
 mile.setText(String.valueOf(integerValu/1.609));
 yard.setText(String.valueOf(integerValu*1094));
 ft.setText(String.valueOf(integerValu*3281));
 in.setText(String.valueOf(integerValu*39370));

    }




}
