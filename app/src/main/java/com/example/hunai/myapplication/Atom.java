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
    private String electronConfig, atomicabb;
    private int numbValenceElec;
    private Context cxt;
    private ArrayList<Double> atomicMassArray;
    private ArrayList<String> atomicabbArray;
    private String atomicName;
    private double atomicMoles;

    public Atom(int atomicNumb, Context cxt) {
        this.atomicNumb = atomicNumb;
        this.cxt = cxt;
        atomicMassArray=new ArrayList<Double>();
        atomicMassArray.add(1.01);atomicMassArray.add(4.00);atomicMassArray.add(6.94);atomicMassArray.add(9.01);atomicMassArray.add(10.81);atomicMassArray.add(12.01);atomicMassArray.add(14.01);atomicMassArray.add(15.99);atomicMassArray.add(19.00);atomicMassArray.add(20.18);atomicMassArray.add(22.99);atomicMassArray.add(25.31);atomicMassArray.add(26.98);atomicMassArray.add(28.09);atomicMassArray.add(30.97);atomicMassArray.add(32.07);atomicMassArray.add(35.45);atomicMassArray.add(39.95);atomicMassArray.add(39.10);atomicMassArray.add(40.08);atomicMassArray.add(44.96);atomicMassArray.add(47.87);atomicMassArray.add(50.94);atomicMassArray.add(52.00);atomicMassArray.add(54.94);atomicMassArray.add(55.85);atomicMassArray.add(58.93);atomicMassArray.add(58.69);atomicMassArray.add(63.55);atomicMassArray.add(65.41);atomicMassArray.add(69.72);atomicMassArray.add(72.64);atomicMassArray.add(74.92);atomicMassArray.add(78.96);atomicMassArray.add(79.90);atomicMassArray.add(83.80);atomicMassArray.add(85.47);atomicMassArray.add(87.62);atomicMassArray.add(88.91);atomicMassArray.add(91.22);atomicMassArray.add(92.91);atomicMassArray.add(95.94);atomicMassArray.add(96.91);atomicMassArray.add(101.07);atomicMassArray.add(102.91);atomicMassArray.add(106.42);atomicMassArray.add(107.87);atomicMassArray.add(112.41);atomicMassArray.add(114.82);atomicMassArray.add(118.71);atomicMassArray.add(121.76);atomicMassArray.add(127.60);atomicMassArray.add(126.90);atomicMassArray.add(131.29);
        atomicabbArray= new ArrayList<String>();
        atomicabbArray.add("H");atomicabbArray.add("He");atomicabbArray.add("Li");atomicabbArray.add("Be");atomicabbArray.add("B");atomicabbArray.add("C");atomicabbArray.add("N");atomicabbArray.add("O");atomicabbArray.add("F");atomicabbArray.add("Ne");atomicabbArray.add("Na");atomicabbArray.add("Mg");atomicabbArray.add("Al");atomicabbArray.add("Si");atomicabbArray.add("P");atomicabbArray.add("S");atomicabbArray.add("Cl");atomicabbArray.add("Ar");atomicabbArray.add("K");atomicabbArray.add("Ca");atomicabbArray.add("Sc");atomicabbArray.add("Ti");atomicabbArray.add("V");atomicabbArray.add("Cr");atomicabbArray.add("Mn");atomicabbArray.add("Fe");atomicabbArray.add("Co");atomicabbArray.add("Ni");atomicabbArray.add("Cu");atomicabbArray.add("Zn");atomicabbArray.add("Ga");atomicabbArray.add("Ge");atomicabbArray.add("As");atomicabbArray.add("Se");atomicabbArray.add("Br");atomicabbArray.add("Kr");atomicabbArray.add("Rb");atomicabbArray.add("Sr");atomicabbArray.add("Y");atomicabbArray.add("Zr");atomicabbArray.add("Nb");atomicabbArray.add("Mo");atomicabbArray.add("Tc");atomicabbArray.add("Ru");atomicabbArray.add("Rh");atomicabbArray.add("Pd");atomicabbArray.add("Ag");atomicabbArray.add("Cd");atomicabbArray.add("In");atomicabbArray.add("Sn");atomicabbArray.add("Sb");atomicabbArray.add("Te");atomicabbArray.add("I");atomicabbArray.add("Xe");
        setAtomicName(atomicNumb);
        setAtomicabb(atomicNumb);
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

    public String getAtomicabb(){ return atomicabb;}

    public void setAtomicabb(int atomicNumb){atomicabb=atomicabbArray.get(atomicNumb-1);}

    private void setAtomicName(int atomicNumb) {
        String[] elements = cxt.getResources().getStringArray(R.array.elements_names);
        List<String> elementNames = Arrays.asList(elements);
        atomicName = elementNames.get(atomicNumb-1);
    }

    private void setAtomicNumb(int atomicNumb) {
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

    private void setElectronConfig(int atomicNumb) {
        if(atomicNumb<=2){
            this.electronConfig="1s"+this.superscript(""+atomicNumb);
        }
        else if(atomicNumb>2 && atomicNumb<=4){
            this.electronConfig="1s"+this.superscript(""+2)+"2s"+this.superscript(""+(atomicNumb-2));
        }
        else if(atomicNumb>4 && atomicNumb<=10){
            this.electronConfig="1s"+this.superscript(""+2)+"2s"+this.superscript(""+2)+"2p"+this.superscript(""+(atomicNumb-4));
        }
        else if(atomicNumb>10 && atomicNumb<=12){
            this.electronConfig="1s"+this.superscript(""+2)+"2s"+this.superscript(""+2)+"2p"+this.superscript(""+6)+"3s"+this.superscript(""+(atomicNumb-10));
        }
        else if(atomicNumb>12 && atomicNumb<=18){
            this.electronConfig="1s"+this.superscript(""+2)+"2s"+this.superscript(""+2)+"2p"+this.superscript(""+6)+"3s"+this.superscript(""+2)+"3p"+this.superscript(""+(atomicNumb-12));
        }
        else if(atomicNumb>18 && atomicNumb<=20){
            this.electronConfig="1s"+this.superscript(""+2)+"2s"+this.superscript(""+2)+"2p"+this.superscript(""+6)+"3s"+this.superscript(""+2)+"3p"+this.superscript(""+6)+"4s"+this.superscript(""+(atomicNumb-18));
        }
        else if(atomicNumb>20 && atomicNumb<=30){
            this.electronConfig="1s"+this.superscript(""+2)+"2s"+this.superscript(""+2)+"2p"+this.superscript(""+6)+"3s"+this.superscript(""+2)+"3p"+this.superscript(""+6)+"4s"+this.superscript(""+2)+"3d"+this.superscript(""+(atomicNumb-20));
        }
        else if(atomicNumb>30 && atomicNumb<=36){
            this.electronConfig="1s"+this.superscript(""+2)+"2s"+this.superscript(""+2)+"2p"+this.superscript(""+6)+"3s"+this.superscript(""+2)+"3p"+this.superscript(""+6)+"4s"+this.superscript(""+2)+"3d"+this.superscript(""+10)+"4p"+this.superscript(""+(atomicNumb-30));
        }
        else if(atomicNumb>36 && atomicNumb<=38){
            this.electronConfig="1s"+this.superscript(""+2)+"2s"+this.superscript(""+2)+"2p"+this.superscript(""+6)+"3s"+this.superscript(""+2)+"3p"+this.superscript(""+6)+"4s"+this.superscript(""+2)+"3d"+this.superscript(""+10)+"4p"+this.superscript(""+6)+"5s"+this.superscript(""+(atomicNumb-36));
        }
        else if(atomicNumb>38 && atomicNumb<=48){
            this.electronConfig="1s"+this.superscript(""+2)+"2s"+this.superscript(""+2)+"2p"+this.superscript(""+6)+"3s"+this.superscript(""+2)+"3p"+this.superscript(""+6)+"4s"+this.superscript(""+2)+"3d"+this.superscript(""+10)+"4p"+this.superscript(""+6)+"5s"+this.superscript(""+2)+"4d"+this.superscript(""+(atomicNumb-38));
        }
        else if(atomicNumb>48 && atomicNumb<=54){
            this.electronConfig="1s"+this.superscript(""+2)+"2s"+this.superscript(""+2)+"2p"+this.superscript(""+6)+"3s"+this.superscript(""+2)+"3p"+this.superscript(""+6)+"4s"+this.superscript(""+2)+"3d"+this.superscript(""+10)+"4p"+this.superscript(""+6)+"5s"+this.superscript(""+2)+"4d"+this.superscript(""+10)+"5p"+this.superscript(""+(atomicNumb-48));
        }
    }

    public int getNumbValenceElec() {
        return numbValenceElec;
    }

    private void setNumbValenceElec(int atomicNumb) {

        if (atomicNumb<3){
            this.numbValenceElec = atomicNumb;
        }
        else if(atomicNumb>=3 && atomicNumb<=10){
            this.numbValenceElec=atomicNumb-2;
        }
        else if(atomicNumb>=11 && atomicNumb<=18){
            this.numbValenceElec=atomicNumb-10;
        }
        else if(atomicNumb>=19 && atomicNumb<30){
            this.numbValenceElec=atomicNumb-18;
        }
        else if(atomicNumb>=30 && atomicNumb<=36){
            this.numbValenceElec=atomicNumb-28;
        }
        else if(atomicNumb>=37 && atomicNumb<=47){
            this.numbValenceElec=atomicNumb-36;
        }
        else if(atomicNumb>=48 && atomicNumb<=54){
            this.numbValenceElec=atomicNumb-46;
        }
    }



    public void setAtomicMoles(double amount){
        this.atomicMoles= amount/getAtomicMass();
    }
    public double getAtomicMoles(){
        return atomicMoles;
    }
    public static String superscript(String str) {
        str = str.replaceAll("0", "⁰");
        str = str.replaceAll("1", "¹");
        str = str.replaceAll("2", "²");
        str = str.replaceAll("3", "³");
        str = str.replaceAll("4", "⁴");
        str = str.replaceAll("5", "⁵");
        str = str.replaceAll("6", "⁶");
        str = str.replaceAll("7", "⁷");
        str = str.replaceAll("8", "⁸");
        str = str.replaceAll("9", "⁹");
        return str;
    }

}

