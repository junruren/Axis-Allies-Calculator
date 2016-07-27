package com.android.axisallies;

import android.content.Intent;
import android.database.DefaultDatabaseErrorHandler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

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

                // Calculate and Save the result
                calculateConvoy(num2, num1);

                // Testing:
                //Toast.makeText(ConvoyActivity.this, ""+DataHolder.convoyResultIPC, Toast.LENGTH_SHORT).show();

                // Go to ConvoyResultActivity
                startActivity(new Intent(ConvoyActivity.this, ConvoyResultActivity.class));
            }
        });
    }

    void calculateConvoy(int num2, int num1) {
        // Clear the Results and Details
        DataHolder.clearConvoy();

        // Add dices into an ArrayList
        ArrayList<Dice> dices = new ArrayList<Dice>();
        int totalNumDice = num2 * 2 + num1;
        for(int i = 0; i < totalNumDice; i++) {
            dices.add(new Dice());
        }
        // Traverse through the list and sum the results
        int ipcCount = 0;
        for (int j = 0; j < dices.size(); j++) {
            int curVal = dices.get(j).getValue();
            if (curVal <= 3) {
                ipcCount += curVal;
            }
            String current = "Dice " + j + ": " + curVal + "\n";
            DataHolder.convoyResultDetail += current;
        }
        // In case there's no dices, put a message in the detail
        if( (num1 + num2)==0 ) {
            DataHolder.convoyResultDetail = "No dices tossed!";
        }
        // Pass the icpCount to DataHolder
        DataHolder.convoyResultIPC = ipcCount;
    }
}
