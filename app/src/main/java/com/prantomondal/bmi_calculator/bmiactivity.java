package com.prantomondal.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bmiactivity extends AppCompatActivity {

    android.widget.Button mrecalculateBMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);
        getSupportActionBar().hide();
        mrecalculateBMI = findViewById(R.id.recalculateBMI);
        mrecalculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(bmiactivity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}