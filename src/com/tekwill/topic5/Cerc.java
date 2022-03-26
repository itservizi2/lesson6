package com.tekwill.topic5;

public class Cerc extends FiguraGeometrica {
    private double razaCercului;

    public void setRazaCercului(double razaCercului) {
        if (razaCercului < 0){
            System.out.println("Raza e gresita");
        } else {
            System.out.println("Raza e > 0");
            this.razaCercului = razaCercului;
        }

    }

    public double getRazaCercului() {
        return razaCercului;
    }




    @Override
    public double returneazaAria() {
        this.ariaFigurii = 3.14 * razaCercului * razaCercului;
        return this.ariaFigurii;
    }

    @Override
    public double returneazaPerimetru() {

        this.perimetrulFigurii = 2 * 3.14 * razaCercului;
        return this.perimetrulFigurii;
    }
}
