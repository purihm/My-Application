package com.example.hunai.myapplication;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CoreChargeScreen extends AppCompatActivity {
    AnimationDrawable circleAnimation;
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

        ImageView[] electronList= new ImageView[12];
        int index;
        RelativeLayout rl=(RelativeLayout)findViewById(R.id.content_corecharge_relativelayout);
        ImageView electronView1=new ImageView(this);
        ImageView electronView2=new ImageView(this);
        ImageView electronView3=new ImageView(this);
        ImageView electronView4=new ImageView(this);
        ImageView electronView5=new ImageView(this);
        ImageView electronView6=new ImageView(this);
        ImageView electronView7=new ImageView(this);
        ImageView electronView8=new ImageView(this);
        ImageView electronView9=new ImageView(this);
        ImageView electronView10=new ImageView(this);
        ImageView electronView11=new ImageView(this);
        electronList[1]=electronView1;
        electronList[2]=electronView2;
        electronList[3]=electronView3;
        electronList[4]=electronView4;
        electronList[5]=electronView5;
        electronList[6]=electronView6;
        electronList[7]=electronView7;
        electronList[8]=electronView8;
        electronList[9]=electronView9;
        electronList[10]=electronView10;
        electronList[11]=electronView11;

        RelativeLayout.LayoutParams[] params= new RelativeLayout.LayoutParams[12];
        for(index=1; index<=atom.getNumbValenceElec();index++){
           params[index] =  new RelativeLayout.LayoutParams(30,40);
            params[index].leftMargin=index*50;
            params[index].topMargin=index*50;
            electronList[index].setImageResource(R.drawable.electroncircle);
            rl.addView(electronList[index], params[index]);
        }

    }

}
