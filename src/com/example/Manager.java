package com.example;

import java.security.InvalidParameterException;

public class Manager extends BueroArbeiter{

    private double bonusSatz;
    public Manager(int id, String name, double festgehalt, double bonusSatz) {
        super(id, name, festgehalt);
        this.bonusSatz = bonusSatz;
    }

    @Override
    public double einkommen(){
        return super.einkommen() + bonusSatz;
    }

    @Override
    public void setID(int id){
        //Manager IDs sind positiv, vierstellig und beginnen mit 50.
        if(id > 4999 && id < 5100){
            super.setID(id);
        }
        else{
            throw new InvalidParameterException("Manager ID muss mit 50 beginnen, vierstellig und positiv sein");
        }
    }

    public double berechneBonus(){
        return bonusSatz;
    }

    @Override
    public String toString(){
        return super.getName()
                + "\nGehalt: " + einkommen();
    }

}
