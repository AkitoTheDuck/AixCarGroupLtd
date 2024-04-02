package com.example;

import com.example.Manager;
import com.example.Mitarbeiter;
import java.util.*;

public class Abteilung {

    private String name;

    private Set<Mitarbeiter> mitarbeiter;

    private Manager leiter;

    public Abteilung(String name, Manager leiter){
        setName(name);
        setLeiter(leiter);
        mitarbeiter = new TreeSet<Mitarbeiter>(Comparator.comparing(Mitarbeiter::getName));
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){return this.name;};

    public void setLeiter(Manager leiter){
        this.leiter = leiter;
    }
    public void add(Mitarbeiter neuerMitarbeiter){
        mitarbeiter.add(neuerMitarbeiter);
    }

    public void remove(Mitarbeiter welcherMitarbeiter){
        mitarbeiter.remove(welcherMitarbeiter);
    }

    public Manager changeLeiter(Manager neuerManager){
        Manager tempManager = this.leiter;
        leiter = neuerManager;
        return tempManager;
    }

    public String gehaltsListe(){
        String gehaltsListe = this.getName();
        for (Mitarbeiter mits : mitarbeiter){
           gehaltsListe =  gehaltsListe += "\n" + mits.getName()
                   + "\nGehalt: " + mits.einkommen() + "\n";
        }
        return gehaltsListe;
    }
}
