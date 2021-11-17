package com.example.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText sVText, fVText;
    Button plusButton, minusButton, multButton, divButton;
    TextView resText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fVText = findViewById(R.id.fV);
        sVText = findViewById(R.id.sV);
        resText = findViewById(R.id.res);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fVStr = fVText.getText().toString();
                float fV = Float.parseFloat(fVStr);
                float sV = Float.parseFloat(sVText.getText().toString());
                float res = fV + sV;
                resText.setText(Float.valueOf(res).toString());

            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fVStr = fVText.getText().toString();
                float fV = Float.parseFloat(fVStr);
                float sV = Float.parseFloat(sVText.getText().toString());
                float res = fV - sV;
                resText.setText(Float.valueOf(res).toString());

            }
        });
        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fVStr = fVText.getText().toString();
                float fV = Float.parseFloat(fVStr);
                float sV = Float.parseFloat(sVText.getText().toString());
                float res = fV * sV;
                resText.setText(Float.valueOf(res).toString());

            }
        });

    }
}