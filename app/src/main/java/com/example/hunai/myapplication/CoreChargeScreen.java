package com.example.hunai.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CoreChargeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core_charge_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle atomicNumbers = getIntent().getExtras();
        Atom atom = new Atom(atomicNumbers.getInt("atom"), getApplicationContext());
        Toast.makeText(CoreChargeScreen.this, atom.getAtomicName() + " has " + (atom.getAtomicNumb()) + " electrons.", Toast.LENGTH_SHORT).show();
        TextView coreChargeView = (TextView) findViewById(R.id.coreChargeView);
        coreChargeView.setText("+" + atom.getNumbValenceElec());
    }

}
