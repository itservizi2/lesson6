package com.tekwill.lesson6sintaxandclasses;

public class StudentDecis {
    public StudentDecis(String numeAtribuit, int idnpAtribuit) {
        nume = numeAtribuit;
        this.idnp = idnpAtribuit;

    }
    int idnp;
    String nume;
    boolean dornicSaInvete;

    public void faceTemaPentruAcasa() {
        System.out.println( nume + " este bravo, o sa aiba rezultate");
        this.dornicSaInvete = true;
    }

}
