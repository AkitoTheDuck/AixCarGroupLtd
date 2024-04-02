package com.example;

import java.security.InvalidParameterException;

public abstract class Mitarbeiter {
    private int id;
    private String name;

    public Mitarbeiter(int id, String name){
        setID(id);
        setName(name);
    }

    public abstract double einkommen();

    public void setID(int id){
        if(id > 999 && id < 10000){
            this.id = id;
        }
        else{
            throw new InvalidParameterException("ID muss vierstellig und positiv sein");
        }
    }

    @Override
    public String toString(){
        return "Basic Mitarbeiter";
    }

    protected int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    protected void setName(String name){
        this.name = name;
    }
}
