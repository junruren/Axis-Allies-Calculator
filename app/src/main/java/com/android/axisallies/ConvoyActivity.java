package com.android.axisallies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConvoyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convoy);

        // Get the EditTexts
        final EditText numTwo = (EditText) findViewById(R.id.numTwo);
        final EditText numOne = (EditText) findViewById(R.id.numOne);

        // Get the Button
        final Button btConvoyCalculate = (Button) findViewById(R.id.btConvoyCalculate);

        btConvoyCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the values from two EditTexts
                int num2 = Integer.parseInt(numTwo.getText().toString());
                int num1 = Integer.parseInt(numOne.getText().toString());

                // TODO: Save the numbers and calculate the result
            }
        });
    }
}
