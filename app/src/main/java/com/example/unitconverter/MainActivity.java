package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      TextView output;
      EditText EnterNum;
      Button miles;
      Button kilometers;
      Button centimeters;
      Button meter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.textView);
        EnterNum = findViewById(R.id.editTextNumberDecimal);
        miles = findViewById(R.id.mile);
        centimeters = findViewById(R.id.centimeter);
        kilometers = findViewById(R.id.kilometer);
        meter = findViewById(R.id.meter);

        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float meters = (number * 1000);
                output.setText("value in meters:"+meters);
            }
        });

        centimeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
               float centimeter = (number * 100);
                output.setText("value in centimeters:"+centimeter);
            }
        });

        kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double kilometer = (number * 0.001);
                output.setText("value in kilometers:"+kilometer);
            }
        });

       miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double mile = (number / 1.609);
                output.setText("value in miles:"+mile);
            }
        });
    }
}



