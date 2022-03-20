package com.tekwill.topic2;

public class Persoana {
    public String prenumePersoana;
    protected String numePersoana;
    private int virsta;

    public void seteazaVirsta(int virstaAtribuita) {
        this.virsta = virstaAtribuita;
        System.out.println(" virsta a fost populata cu valoarea " + this.virsta);
    }
    public int getVirsta() {
        return this.virsta;

    }

}
