package com.example.bernice.missionmidterm;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button One
        Button bOne = (Button)findViewById(R.id.buttonOne);
        bOne.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent();
                myIntent.setAction(Settings.ACTION_WIFI_SETTINGS);
                MainActivity.this.startActivity(myIntent);

            }
        });

        Button bTwo = (Button)findViewById(R.id.buttonTwo);
        bTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You Clicked on Button Two",Toast.LENGTH_LONG).show();
            }
        });

    }
}
