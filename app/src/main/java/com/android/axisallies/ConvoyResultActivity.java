package com.android.axisallies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class ConvoyResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convoy_result);

        // Get the result area
        TextView result = (TextView) findViewById(R.id.textViewResult);

        // Update the result
        Integer ipc = new Integer(DataHolder.convoyResultIPC);
        result.setText(ipc.toString());


        // Get the detail button
        Button btShowDetail = (Button) findViewById(R.id.btShowDetail);
        btShowDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the detail when clicked
                TextView detail = (TextView) findViewById(R.id.textViewDeatil);
                detail.setText(DataHolder.convoyResultDetail);

                // Testing
                ScrollView sc = (ScrollView) findViewById(R.id.scrollView);
                if ( sc == null ) {
                    Toast.makeText(ConvoyResultActivity.this, "No SC!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Get the Back2Main button
        Button btBack2Main = (Button) findViewById(R.id.btBack2Main);
        btBack2Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the Results and Details
                DataHolder.convoyResultDetail = "";
                DataHolder.convoyResultIPC = 0;
                // Return to the MainActivity
                startActivity(new Intent(ConvoyResultActivity.this, MainActivity.class));
            }
        });
    }
}
