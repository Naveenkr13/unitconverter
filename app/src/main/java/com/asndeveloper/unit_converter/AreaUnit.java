package com.asndeveloper.unit_converter;

import static java.lang.String.format;
import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.text.DecimalFormat;

public class AreaUnit extends AppCompatActivity {
EditText editText;
Spinner spinnerr;
TextView acre,hectare,sqgaj,bigha,killa,dhur,decimal,sqinch,katha,sqmeter,gaj,dismil,sqfeet,sqcm,sqkm;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_unit);
        editText=findViewById(R.id.edtValue);
        spinnerr=findViewById(R.id.spin);

        acre=findViewById(R.id.acres);
        hectare=findViewById(R.id.hec);
        sqgaj=findViewById(R.id.gaj);
        bigha=findViewById(R.id.Bigha);
        killa=findViewById(R.id.Killa);
        dhur=findViewById(R.id.Dhur);
        decimal=findViewById(R.id.decimals);
        sqinch=findViewById(R.id.Sqinch);
        katha=findViewById(R.id.Katha);
        sqmeter=findViewById(R.id.Sqmeter);
        gaj=findViewById(R.id.GAJ);
        dismil=findViewById(R.id.Dismill);
        sqfeet=findViewById(R.id.SqFeet);
        sqcm=findViewById(R.id.sqcenti);
        sqkm=findViewById(R.id.SqKM);

        //step 1
       String[] array={"acr","hect","sqgaj","bigha","killa","dhur","decimal","sqinch","katha","sqmeter","gaj","dismil","sqft","sqcm","sqkm"};
       spinnerr.setAdapter(new ArrayAdapter<String>(AreaUnit.this, android.R.layout.simple_list_item_1,array));

       //step 2
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                  UpdateArea();
            }
        });

    }


    //step 3
    private void UpdateArea() {
        if (!editText.getText().toString().equals("")&&!spinnerr.getSelectedItem().toString().equals("")){

            double storevalue=Double.parseDouble(editText.getText().toString());

            switch(spinnerr.getSelectedItem().toString()){

                //show the value of acre in all cases means converting into acres while enter
                case"acr":
                    ShowAcre(storevalue);

                    break;
                case "hect":
                    ShowAcre(storevalue*2.471);
                    break;
                case"sqgaj":

                    ShowAcre(storevalue/4886.92);
                    break;
                case"bigha":
                    ShowAcre(storevalue*0.619);
                    break;
                case "killa":
                    ShowAcre(storevalue);
                    break;
                case "dhur":
                    ShowAcre(storevalue*0.0015);
                    break;
                case "decimal":
                    ShowAcre(storevalue*0.009999068);
                    break;
                case "sqinch":
                    ShowAcre(storevalue*0.0000001594228268);
                    break;
                case "katha":
                    ShowAcre(storevalue*0.031);
                    break;
                case "sqmeter":
                    ShowAcre(storevalue*0.0002471054);
                    break;
                case "gaj":
                    ShowAcre(storevalue*0.00021);
                    break;
                case "dismil":
                    ShowAcre(storevalue*0.01);
                    break;
                case "sqft":
                    ShowAcre(storevalue*0.00002295684113);
                case "sqcm":
                    ShowAcre(storevalue*0.00000002471053815);
                    break;
                case "sqkm":
                    ShowAcre(storevalue*247.11);
                    break;
                default:
                    return;
            }
        }


    }
    //step 4

    private void ShowAcre(double storevalue) {
        DecimalFormat decimalFormat=new DecimalFormat("");
        acre.setText(String.valueOf(decimalFormat.format(storevalue)));
        hectare.setText(String.valueOf(decimalFormat.format(storevalue/2.471)));
        sqgaj.setText(String.valueOf(decimalFormat.format(storevalue*4886.92)));
        bigha.setText(String.valueOf(decimalFormat.format(storevalue/0.619)));
        killa.setText(String.valueOf(decimalFormat.format(storevalue)));
        dhur.setText(String.valueOf(decimalFormat.format(storevalue/0.0015)));
        decimal.setText(String.valueOf(decimalFormat.format(storevalue/0.009999068)));
        sqinch.setText(String.valueOf(decimalFormat.format(storevalue/0.0000001594228268)));
        katha.setText(String.valueOf(decimalFormat.format(storevalue/0.031)));
        sqmeter.setText(String.valueOf(decimalFormat.format(storevalue/0.0002471054)));
        gaj.setText(String.valueOf(decimalFormat.format(storevalue/0.00021)));
        dismil.setText(String.valueOf(decimalFormat.format(storevalue/0.01)));
        sqfeet.setText(String.valueOf(decimalFormat.format(storevalue/0.00002295684113)));
        sqcm.setText(String.valueOf(decimalFormat.format(storevalue/0.00000002471053815)));
        sqkm.setText(String.valueOf(decimalFormat.format(storevalue/247.11)));




//        acre.setText(String.format(valueOf(storevalue)));
//        hectare.setText(String.valueOf(storevalue/2.471));
//        sqgaj.setText(String.valueOf(storevalue*4886.92));
    }
}