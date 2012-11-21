package com.example.esercitazione_22_11_2012;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Quinto extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_quinto, menu);
        return true;
    }
}
