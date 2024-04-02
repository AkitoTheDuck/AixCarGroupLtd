package com.example;

import java.security.InvalidParameterException;

public class Schichtarbeiter extends Mitarbeiter{
    private double stundenSatz;
    private int anzahlStunden;

    public Schichtarbeiter(int id, String name, double stundenSatz){
        super(id, name);
        this.stundenSatz = stundenSatz;
    }

    public double einkommen() {
        return stundenSatz * anzahlStunden;
    }

    @Override
    public void setID(int id){
        //Schichtarbeiter IDs sind positiv, vierstellig und beginnen mit der Ziffer 3.
        if(id > 2999 && id < 4000){
            super.setID(id);
        }
        else{
            throw new InvalidParameterException("Schichtarbeiter ID muss mit 3 beginnen, vierstellig und positiv sein");
        }
    }

    public void setAnzahlStunden(int std){
        this.anzahlStunden = std;
    }

    public void arbeite(int anzahlStunden){
        this.anzahlStunden += anzahlStunden;
    }

    public int getAnzahlStunden(){
        return this.anzahlStunden;
    }
    @Override
    public String toString(){
        return super.getName()
                + "\nGehalt: " + einkommen();
    }
}
