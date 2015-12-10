package com.example.hunai.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class convertScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        final TextView moleView=(TextView) findViewById(R.id.moleView);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Conversion Center");
        Bundle atomicNumbers = getIntent().getExtras();
        final Atom atom = new Atom(atomicNumbers.getInt("atom"), getApplicationContext());
        final EditText editText = (EditText) findViewById(R.id.editText);
        Button calculate = (Button) findViewById(R.id.the_button);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atom.setAtomicMoles(Double.parseDouble(editText.getText().toString()));
                moleView.setText("The number of moles is: "+atom.getAtomicMoles());

            }
        });
    }

}