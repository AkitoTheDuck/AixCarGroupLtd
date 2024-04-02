package com.example;

import java.security.InvalidParameterException;

public class BueroArbeiter extends Mitarbeiter{
    private double festgehalt;

    public BueroArbeiter(int id, String name, double festgehalt){
        super(id, name);
        this.festgehalt = festgehalt;

    }

    public double einkommen(){
        return festgehalt;
    }

    @Override
    public void setID(int id){
        //Büroarbeiter IDs sind positiv, vierstellig und beginnen mit 5.
        if(id > 4999 && id < 6000){
            super.setID(id);
        }
        else{
            throw new InvalidParameterException("Bueroarbeiter ID muss mit 5 beginnen, vierstellig und positiv sein");
        }
    }

    @Override
    public String toString(){
        return super.getName()
                + "\nGehalt: " + einkommen();
    }
}
