package com.example;

import java.util.ArrayList;

public class PersonenTransportFahrzeug extends KFZ{
    private ArrayList<Mitarbeiter> passagiere;

    private int sitze;

    /**
     * Erstellt das Objekt Fahrzeug mit entsprechenden Parametern
     *
     * @param tankgroesse
     * @param aktuellePosition
     * @param maxGeschwindigkeit
     */
    public PersonenTransportFahrzeug(int tankgroesse, GPS aktuellePosition, int maxGeschwindigkeit, int sitze) {
        super(tankgroesse, aktuellePosition, maxGeschwindigkeit);
        setSitze(sitze);
    }

    public boolean einsteigen(Mitarbeiter passagier){
        if(passagiere.size() < sitze){
            passagiere.add(passagier);
            return true;
        }
        return false;
    }
    @Override
    boolean einsteigenFahrer(Fahrer fahrer) {
        if(fahrer.getFuehrerschein().equals("B")
            || fahrer.getFuehrerschein().equals("D")){
            setFahrer(fahrer);
            return true;
        }
        return false;
    }
    @Override
    public void parken() {
        if(getGeschwindigkeit() == 0){
            motorAus();
        }
    }
    public Mitarbeiter aussteigen(int vonSitzplatz){
        Mitarbeiter tempMitarbeiter = passagiere.get(vonSitzplatz + 1);
        passagiere.remove(vonSitzplatz);
        return tempMitarbeiter;
    }
    @Override
    double auslastung() {
        return (double)passagiere.size()/sitze*100.00;
    }
    public void setSitze(int sitze){
        this.sitze = sitze;
    }

    public int getSitze(){
        return this.sitze;
    }
}
