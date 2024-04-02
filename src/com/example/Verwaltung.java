package com.example;

import java.util.*;

public class Verwaltung {
    private ArrayList<KFZ> fuhrpark;
    private ArrayList<Mitarbeiter> personal;
    private LinkedList<Schichtarbeiter> arbeiter;
    private ArrayList<Abteilung> abteilungen;
    private HashSet<Lager> lagerverwaltung;

    public Verwaltung(){
        fuhrpark = new ArrayList<KFZ>();
        personal = new ArrayList<Mitarbeiter>();
        arbeiter = new LinkedList<Schichtarbeiter>();
        abteilungen = new ArrayList<Abteilung>();
        lagerverwaltung = new HashSet<Lager>();
    }

    public void addKFZ(KFZ neuesKFZ){
        fuhrpark.add(neuesKFZ);
    }
    public void addMitarbeiter(Mitarbeiter neuerMitarbeiter){
        personal.add(neuerMitarbeiter);
    }
    public void addSchichtarbeiter(Schichtarbeiter neuerSchichtarbeiter){
        arbeiter.add(neuerSchichtarbeiter);
    }
    public void addAbteilung(Abteilung neueAbteilung){
        abteilungen.add(neueAbteilung);
    }

    public void sortMitarbeiter(ArrayList<Mitarbeiter> mitarbeiter){
        mitarbeiter.sort(Comparator.comparing(Mitarbeiter::getName).thenComparing(Mitarbeiter::einkommen));
    }

    public void sortFuhrpark(ArrayList<KFZ> fuhrpark){
        fuhrpark.sort(Comparator.comparing(KFZ::auslastung));
    }

    public void sortSchichtarbeiter(LinkedList<Schichtarbeiter> arbeiter){
        arbeiter.sort(Comparator.comparing(Schichtarbeiter::getAnzahlStunden));
    }

    public void removeKFZ(KFZ altesKFZ){
        fuhrpark.remove(altesKFZ);
    }

    public void removeMitarbeiter(Mitarbeiter welcherMitarbeiter){
        personal.remove(welcherMitarbeiter);
    }

    public void removeSchichtarbeiter(Schichtarbeiter welcherSchichtarbeiter){
        arbeiter.remove(welcherSchichtarbeiter);
    }

    public void removeAbteilung(Abteilung welcheAbteilung){
        abteilungen.remove(welcheAbteilung);
    }

    public void arbeitsTag(){

    }
}
