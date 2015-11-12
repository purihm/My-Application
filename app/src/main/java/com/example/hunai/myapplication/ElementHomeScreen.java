package com.example.hunai.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.io.Serializable;

public class ElementHomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_home_screen);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Bundle atomicNumbers = getIntent().getExtras();
        Atom atom = new Atom(atomicNumbers.getInt("atom"), getApplicationContext());
        Toast.makeText(ElementHomeScreen.this, atom.getAtomicName() + " has " + (atom.getAtomicNumb() + 1) + " electrons.", Toast.LENGTH_SHORT).show();

    }

}
