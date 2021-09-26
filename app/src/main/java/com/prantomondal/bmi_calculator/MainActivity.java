package com.prantomondal.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    android.widget.Button mcalculateBMI;

    TextView mcurrentheight;
    TextView mcurrentage,mcurrentweight;
    ImageView mincrementage,mincrementweight,mdecrementweight,mdecrementage;
    SeekBar mseekbarforheight;
    RelativeLayout mmale,mfemale;

    int intweight=55;
    int intage = 22;
    int currentprogress;
    String mintprogress = "170";
    String typeofuser = "0";
    String weight2 = "55";
    String age2 = "22";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        mcalculateBMI = findViewById(R.id.calculateBMI);
        mcurrentage = findViewById(R.id.currentAge);
        mcurrentweight = findViewById(R.id.currentWeight);
        mcurrentheight = findViewById(R.id.currentHeight);
        mincrementage = findViewById(R.id.incrementAge);
        mdecrementage = findViewById(R.id.decrementAge);
        mincrementweight = findViewById(R.id.incrementWeight);
        mdecrementweight = findViewById(R.id.decrementWeight);
        mseekbarforheight = findViewById(R.id.seekBarForHeight);
        mmale = findViewById(R.id.male);
        mfemale = findViewById(R.id.female);


        mmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfocus));
                typeofuser = "Male";
            }
        });

        mfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfocus));
                typeofuser = "Female";
            }
        });


        mseekbarforheight.setMax(300);
        mseekbarforheight.setProgress(170);
        mseekbarforheight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentprogress = progress;
                mintprogress = String.valueOf(currentprogress);
                mcurrentheight.setText(mintprogress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        mcalculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bmiactivity.class);
                startActivity(intent);
            }
        });
    }
}