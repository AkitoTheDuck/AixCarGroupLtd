package com.example;

abstract class KFZ{
    private double tankGroesse;
    private double tankinhalt;
    private double geschwindigkeit;
    private int maxGeschwindigkeit;
    private Fahrer fahrer;
    private boolean motorAn;
    private GPS aktuellePosition;

    /**
     * Erstellt das Objekt Fahrzeug mit entsprechenden Parametern
     * @param tankgroesse
     * @param aktuellePosition
     * @param maxGeschwindigkeit
     */
    public KFZ(int tankgroesse, GPS aktuellePosition, int maxGeschwindigkeit){
        setTankGroesse(tankgroesse);
        setAktuellePosition(aktuellePosition);
        setMaxGeschwindigkeit(maxGeschwindigkeit);
        this.tankinhalt = 0;
        this.geschwindigkeit = 0;
        this.fahrer = null;
        this.motorAn = false;
    }

    private void setMaxGeschwindigkeit(int maxGeschwindigkeit) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public void fahreZu(GPS ziel){
        if(motorAn){
            setAktuellePosition(ziel);
        }
    }

    /**
     *Tankt das Fahrzeug um (+) Liter.
     * Wenn die Anzahl an Liter die Tankgroesse überschreitet, wird bis zum Maximum gefüllt
     * @param liter
     */
    public double tanken(double liter){
        if(tankinhalt + liter > tankGroesse){
            double newTank = (tankinhalt + liter) - tankGroesse;
            this.tankinhalt += newTank;
            return tankinhalt + liter;
        }
        else{
            this.tankinhalt += liter;
            return tankinhalt += liter;
        }
    }

    /**
     *Bremst das Fahrzeug im positivem Bereich ab
     * @param bremsFaktor
     */
    public void bremsen(int bremsFaktor){
        if(geschwindigkeit > 0 ){
            if(this.geschwindigkeit - bremsFaktor > 0){
                this.geschwindigkeit -= bremsFaktor;
            }
        }
    }

    /**
     *Fährt mit dem Fahrzeug mit (+) Geschwindigkeit
     * @param beschleuFaktor
     */
    public void beschleunigen(double beschleuFaktor){
        if(motorAn){
            geschwindigkeit += beschleuFaktor;
        }
    }

    public void aussteigenFahrer(){
        if(!motorAn)
            this.fahrer = null;
    }

    abstract boolean einsteigenFahrer(Fahrer fahrer);

    public void parken(){

    };

    public boolean isMotorAn(){
        if(motorAn)
            return true;
        return false;
    }

    public boolean motorAn(){
        if(!motorAn){
            motorAn = true;
            return true;
        }
        return false;
    }
    public boolean motorAus(){
        if(!motorAn){
            motorAn = false;
            return true;
        }
        return false;
    }

    /**
     *Gibt Stammdaten des Fahrzeugs aus
     * @return
     */
    public String stammDatentoString(){
        return "Auto: "
                + "Tankgroesse: " + tankGroesse
                + ", "
                + "aktuelle Geschwindigkeit: " + geschwindigkeit
                + ", "
                + "Tankinhalt: " + tankinhalt;
    }

    /**
     *Gibt Bewegungsdaten des Fahrzeugs aus
     * @return
     */
    public String bewegungsDatentoString(){
        return "Auto: "
                + "Tankgroesse: " + tankGroesse
                + ", "
                + "aktuelle Geschwindigkeit: " + geschwindigkeit
                + ", "
                + "Tankinhalt: " + tankinhalt;
    }

    abstract double auslastung();

    /**
     *Tankgroesse des Fahrzeugs wird angegeben
     * Nur positive Werte > 0 sind erlaubt
     * @param tankGroesse
     */
    public void setTankGroesse(int tankGroesse){
        if(tankGroesse > 0)
            this.tankGroesse = tankGroesse;
    }

    /**
     *Setzt den Tankinhalt des Fahrzeugs
     * Nur positive Werte > 0 sind erlaubt
     * @param tankinhalt
     */
    public void setTankinhalt(int tankinhalt){
        if(tankinhalt > 0)
            this.tankinhalt = tankinhalt;
    }

    /**
     *Gibt die aktuelle Geschwindigkeit an
     * Nur positive Werte > 0 sind erlaubt
     * @param geschwindigkeit
     */
    public void setGeschwindigkeit(int geschwindigkeit){
        if(geschwindigkeit >= 0)
            this.geschwindigkeit = geschwindigkeit;
    }

    public double getGeschwindigkeit(){
        return this.geschwindigkeit;
    }

    public void setFahrer(Fahrer fahrer){
        if(this.fahrer == null)
            this.fahrer = fahrer;
    }

    public void setAktuellePosition(GPS aktuellePosition){
        this.aktuellePosition = aktuellePosition;
    }

    public GPS getAktuellePosition(){return this.aktuellePosition;}

    public Fahrer getFahrer(){return this.fahrer;}
}