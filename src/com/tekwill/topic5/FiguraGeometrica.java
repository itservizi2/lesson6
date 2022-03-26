package com.tekwill.topic5;

public abstract class FiguraGeometrica {
   protected double ariaFigurii;
   protected double perimetrulFigurii;

    public abstract double returneazaAria();
    public abstract double returneazaPerimetru();

    public double getAriaFigurii() {
        return ariaFigurii;
    }

    public double getPerimetrulFigurii() {
        return perimetrulFigurii;
    }
}

