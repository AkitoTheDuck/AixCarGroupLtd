package com.example;

public class Lager {

    private String gueterName;
    private int gueterNummer;
    public Lager(String gueterName, int gueterNummer){
        setGueterName(gueterName);
        setGueterNummer(gueterNummer);
    }

    public void setGueterName(String name){
        this.gueterName = name;
    }

    public void setGueterNummer(int nummer){
        this.gueterNummer = nummer;
    }

    public String getGueterName(){
        return this.gueterName;
    }

    public int getGueterNummer(){
        return this.gueterNummer;
    }

}
