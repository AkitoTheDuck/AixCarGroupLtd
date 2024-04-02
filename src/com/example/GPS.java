package com.example;

public class GPS {
    private double laengengrad;
    private double breitengrad;

    public GPS(double laengengrad, double breitengrad) {
        setLaengengrad(laengengrad);
        setBreitengrad(breitengrad);
    }

    private void setLaengengrad(double laengengrad) {
        this.laengengrad = laengengrad;
    }

    private void setBreitengrad(double breitengrad) {
        this.breitengrad = breitengrad;
    }
}
