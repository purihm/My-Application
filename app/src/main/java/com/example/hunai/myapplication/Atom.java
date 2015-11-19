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
    private int atomicMass;
    private String electronConfig;
    private int coreCharge;
    private int numbValenceElec;
    Context cxt;

    private String atomicName;

    public Atom(int atomicNumb, Context cxt) {
        this.atomicNumb = atomicNumb;
        this.cxt = cxt;
        setAtomicMass(atomicNumb);
        setElectronConfig(atomicNumb);
        setNumbValenceElec(atomicNumb);
        setAtomicName(atomicNumb);
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
        atomicName = elementNames.get(atomicNumb);
    }

    public void setAtomicNumb(int atomicNumb) {
        this.atomicNumb = atomicNumb;
    }

    public int getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(int atomicMass) {
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

    public void setNumbValenceElec(int numbValenceElec) {
        this.numbValenceElec = numbValenceElec;
    }

}

