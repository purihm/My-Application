package com.example.hunai.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class Main2Activity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);}

            public void onRadioButtonClicked(View view) {
                boolean checked = ((RadioButton) view).isChecked();
                Bundle atomicNumbers = getIntent().getExtras();
                Atom atom = new Atom(atomicNumbers.getInt("atom"), getApplicationContext());
                switch (view.getId()) {
                    case R.id.coreChargeButton:
                    if (checked) {
                        Intent intent = new Intent(Main2Activity.this, CoreChargeScreen.class);
                        intent.putExtra("atom", atom.getAtomicNumb());
                        startActivity(intent);
                    }
                break;
                    case R.id.electronInfoButton:
                    if (checked) {
                        Intent intent = new Intent(Main2Activity.this, ElementHomeScreen.class);
                        intent.putExtra("atom", atom.getAtomicNumb());
                        startActivity(intent);
                    }
                break;
                }

            }

        }
