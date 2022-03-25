package com.tekwill.topic5;

public class Romb extends FiguraGeometrica {
    private double diagonalaMica;
    private double diagonalaMare;

    private double laturaMica;
    private double laturaMare;

    public void setDiagonale(double diagonalaMare, double diagonalaMica) {
        if((diagonalaMare > diagonalaMica) && (diagonalaMare > 0) && (diagonalaMica > 0)) {
            this.diagonalaMare = diagonalaMare;
            this.diagonalaMica = diagonalaMica;
            System.out.println("Diagonalele au fost setate cu success");
        } else {
            System.out.println("Valoarea diagonalelor e gresita, setati valorile corecte");
        }
    }
    public void setLaturaMare(double laturaMare) {
        this.laturaMare = laturaMare;
    }

    public void setLaturaMica(double laturaMica) {
        this.laturaMica = laturaMica;
    }

    @Override
    public double returneazaPerimetru() {
        this.perimetrulFigurii = 2 * laturaMare + 2 * laturaMica;
        return this.perimetrulFigurii;
    }

    @Override
    public double returneazaAria() {
        this.ariaFigurii = diagonalaMare * diagonalaMica / 2;
        return this.ariaFigurii;
    }
}
