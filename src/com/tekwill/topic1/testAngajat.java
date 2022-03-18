package com.tekwill.topic1;

public class testAngajat {
    public static void main(String[] args) {
        Angajat petruMarinescu = new Angajat("Petru Marinescu",10000 , "masculin");
        Angajat alinaPostolachi = new Angajat("Alina Postolachi", 8000, "feminin");
        petruMarinescu.afiseazaAngajat();
        alinaPostolachi.afiseazaAngajat();
        petruMarinescu.seteazaSalariul(11000);
        alinaPostolachi.seteazaSalariul(9500);

    }
}
