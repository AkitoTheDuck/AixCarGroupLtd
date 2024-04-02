package com.example;

public class LKW extends KFZ{
    private double ladeFlaeche;
    private double ladung;
    public LKW(int tankgroesse, GPS aktuellePosition, int maxGeschwindigkeit, double ladeFlaeche) {
        super(tankgroesse, aktuellePosition, maxGeschwindigkeit);
        this.ladeFlaeche = ladeFlaeche;
        this.ladung = 0;
    }

    public void beladen(double menge){
        if(ladung + menge > ladeFlaeche){

        }
        else{
            ladung += menge;
        }
    }

    public void entladen(double menge){
        if(ladung - menge < 0){

        }
        else{
            ladung -= menge;
        }
    }
    @Override
    boolean einsteigenFahrer(Fahrer fahrer) {
        if(fahrer.getFuehrerschein().equals("C")){
            setFahrer(fahrer);
            return true;
        }
        return false;
    }

    @Override
    double auslastung() {
        return ladung/ladeFlaeche*100.00;
    }
}
