package com.example2017.android.elsanawya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class firstScience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_science);
    }

    public void bufirst(View view){

        Intent intent = new Intent(this,science.class);
        startActivity(intent);


    }



}
