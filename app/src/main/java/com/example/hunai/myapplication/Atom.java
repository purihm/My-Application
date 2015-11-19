package com.example.hunai.myapplication;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hunai on 11/6/2015.
 */
public class Atom{
    private int atomicNumb;
    private double atomicMass;
    private String electronConfig;
    private int coreCharge;
    private int numbValenceElec;
    private Context cxt;
    List<Double> atomicMassArray;
    private String atomicName;

    public Atom(int atomicNumb, Context cxt) {
        this.atomicNumb = atomicNumb;
        this.cxt = cxt;
        atomicMassArray=new ArrayList<Double>();
        atomicMassArray.add(1.01);atomicMassArray.add(4.00);atomicMassArray.add(6.94);atomicMassArray.add(9.01);atomicMassArray.add(10.81);atomicMassArray.add(12.01);atomicMassArray.add(14.01);atomicMassArray.add(15.99);atomicMassArray.add(19.00);atomicMassArray.add(20.18);atomicMassArray.add(22.99);atomicMassArray.add(25.31);atomicMassArray.add(26.98);atomicMassArray.add(28.09);atomicMassArray.add(30.97);atomicMassArray.add(32.07);atomicMassArray.add(35.45);atomicMassArray.add(39.95);atomicMassArray.add(39.10);atomicMassArray.add(40.08);atomicMassArray.add(44.96);atomicMassArray.add(47.87);atomicMassArray.add(50.94);atomicMassArray.add(52.00);atomicMassArray.add(54.94);atomicMassArray.add(55.85);atomicMassArray.add(58.93);atomicMassArray.add(58.69);atomicMassArray.add(63.55);atomicMassArray.add(65.41);atomicMassArray.add(69.72);atomicMassArray.add(72.64);atomicMassArray.add(74.92);atomicMassArray.add(78.96);atomicMassArray.add(79.90);atomicMassArray.add(83.80);atomicMassArray.add(85.47);atomicMassArray.add(87.62);atomicMassArray.add(88.91);atomicMassArray.add(91.22);atomicMassArray.add(92.91);atomicMassArray.add(95.94);atomicMassArray.add(96.91);atomicMassArray.add(101.07);atomicMassArray.add(102.91);atomicMassArray.add(106.42);atomicMassArray.add(107.87);atomicMassArray.add(112.41);atomicMassArray.add(114.82);atomicMassArray.add(118.71);atomicMassArray.add(121.76);atomicMassArray.add(127.60);atomicMassArray.add(126.90);atomicMassArray.add(131.29);
        setAtomicName(atomicNumb);
        setAtomicMass(atomicNumb);
        setElectronConfig(atomicNumb);
        setNumbValenceElec(atomicNumb);
    }

    public int getAtomicNumb() {
        return atomicNumb;
    }

    public String getAtomicName() {
        return atomicName;
    }

    public void setAtomicName(int atomicNumb) {
        String[] elements = cxt.getResources().getStringArray(R.array.elements_names);
        List<String> elementNames = Arrays.asList(elements);
        atomicName = elementNames.get(atomicNumb-1);
    }

    public void setAtomicNumb(int atomicNumb) {
        this.atomicNumb = atomicNumb;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(int atomicNumb) {
        atomicMass=atomicMassArray.get(atomicNumb-1);
    }

    public String getElectronConfig() {
        return electronConfig;
    }

    public void setElectronConfig(int atomicNumb) {
    }

    public int getCoreCharge() {
        return coreCharge;
    }

    public void setCoreCharge(int coreCharge) {
        this.coreCharge = coreCharge;
    }

    public int getNumbValenceElec() {
        return numbValenceElec;
    }

    public void setNumbValenceElec(int atomicNumb) {

        if (atomicNumb<3){
            this.numbValenceElec = atomicNumb;
        }
        if(atomicNumb>=3 && atomicNumb<=10){
            this.numbValenceElec=atomicNumb-2;
        }
        if(atomicNumb>=11 && atomicNumb<=18){
            this.numbValenceElec=atomicNumb-10;
        }
        if(atomicNumb>=19 && atomicNumb<30){
            this.numbValenceElec=atomicNumb-18;
        }
        if(atomicNumb>=30 && atomicNumb<=36){
            this.numbValenceElec=atomicNumb-28;
        }
        if(atomicNumb>=37 && atomicNumb<=47){
            this.numbValenceElec=atomicNumb-36;
        }
        if(atomicNumb>=48 && atomicNumb<=54){
            this.numbValenceElec=atomicNumb-46;
        }
    }

}

