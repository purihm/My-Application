package com.example.hunai.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
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
        Toast.makeText(ElementHomeScreen.this, atom.getAtomicName() + " has " + (atom.getAtomicNumb()) + " electrons.", Toast.LENGTH_SHORT).show();
        TextView atomicMassView = (TextView) findViewById(R.id.atomicMassView);
        atomicMassView.setText("The atomic mass is " + atom.getAtomicMass());
        TextView elecConfigView=(TextView) findViewById(R.id.elecConfigView);
        elecConfigView.setText("The electron configuration is "+atom.getElectronConfig());
        TextView atomicabbView=(TextView) findViewById(R.id.atomicabbView);
        atomicabbView.setText("The element symbol is: " +atom.getAtomicabb());
        TextView atomicValenceView=(TextView) findViewById(R.id.atomicValenceView);
        atomicValenceView.setText("The number of valence electrons is: " +atom.getNumbValenceElec());

    }

}
