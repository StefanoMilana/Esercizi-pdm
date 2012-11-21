package com.example.esercitazione_22_11_2012;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Quarto extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_quarto, menu);
        return true;
    }
}
