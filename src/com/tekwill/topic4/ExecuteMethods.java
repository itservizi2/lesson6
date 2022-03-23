package com.tekwill.topic4;

public class ExecuteMethods {
    public static void main(String[] args) {
        int rezultat = Methods.sum(20 ,5);
        System.out.println(rezultat);

        int rezultat2 = Methods.sum(20 ,20);
        System.out.println(rezultat2);

        int rezultat3 = Methods.sum(10 ,13);
        System.out.println(rezultat3);

        Methods.sum(5.5);

        Persoana andreiS = new Persoana("Andrei S", 25);
        andreiS.afiseazaCategoriaDeVirsta();

    }
}
