package com.app.hokagelab.kalkulator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pembuat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembuat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Kembali");

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


}
