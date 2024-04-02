package com.example;

public class Bus extends PersonenTransportFahrzeug{

    public Bus(int tankgroesse, GPS aktuellePosition, int maxGeschwindigkeit, int sitze) {
        super(tankgroesse, aktuellePosition, maxGeschwindigkeit, sitze);
    }
    @Override
    boolean einsteigenFahrer(Fahrer fahrer) {
        if(getFahrer() == null){
            setFahrer(fahrer);
            return true;
        }
        return false;
    }
}
