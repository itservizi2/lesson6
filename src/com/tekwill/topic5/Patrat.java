package com.tekwill.topic5;

public class Patrat extends FiguraGeometrica {
    public Patrat(double marimeaLaturiiAtrbuite){
        latura = marimeaLaturiiAtrbuite;

    }

    private double latura;

//    public void setLatura(double latura) {
//        this.latura = latura;
//    }

    @Override
    public double returneazaAria() {
        this.ariaFigurii = latura * latura;
        return this.ariaFigurii;
    }

    @Override
    public double returneazaPerimetru() {
this.perimetrulFigurii = 4 * latura;
        return this.perimetrulFigurii;
    }
}
