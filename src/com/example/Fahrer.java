package com.example;

public class Fahrer extends Schichtarbeiter{

    private String fuehrerschein;
    enum fuehrerscheinKlasse{
        B,
        C,
        D
    }
    public Fahrer(int id, String name, double stdsatz, String fuehrerschein){
        super(id, name, stdsatz);
        setFuehrerschein(fuehrerschein);
    }

    public void setFuehrerschein(String fuehrerschein){
        if(fuehrerschein.toUpperCase().equals(fuehrerscheinKlasse.B)
                || fuehrerschein.toUpperCase().equals(fuehrerscheinKlasse.C)
                    || fuehrerschein.toUpperCase().equals(fuehrerscheinKlasse.D)){
            this.fuehrerschein = fuehrerschein.toUpperCase();
        }
    }

    public String getFuehrerschein(){
        return this.fuehrerschein;
    }

    public void fahrenZu(KFZ fahrzeug, GPS ziel){
        if(fahrzeug.getFahrer() != null)
            fahrzeug.fahreZu(ziel);
    }
}
