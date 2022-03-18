package com.tekwill.topic1;

public class Angajat {
    public Angajat(String numeAtribuit, double salariuAtribuit, String genAtribuit) {
        nume = numeAtribuit;
        salariu = salariuAtribuit;
        gen = genAtribuit;
    }

    String nume;
    int virsta;
    Double salariu;
    String gen;

    public void afiseazaAngajat() {
        System.out.println(nume + " este angajatul cu salariu de " + salariu + " si este de gen " + gen);
    }
    public void seteazaSalariul(double salariuAtribuit){
        this.salariu = salariuAtribuit;
        System.out.println("Salariul a fost setat " + salariu);
    }
}
