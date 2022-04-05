package com.tekwill.topic8;

public class ServiciuStoc {
    public static void main(String[] args) {
        Carte amintiriDinCopilarie = new Carte("Amintiri din copilarie", " Ion Creanga" ,848646456 , 81);
        Carte aventurileLuiTomSawyer = new Carte("Aventurile lui TomSawyer", " Mark Twain" ,8486321 , 251);
        Carte sherlockHolmes = new Carte("Sherlock Holmes", "  Sir Arthur Conan Doyle" ,521265 , 235);
        Carte annaKarenina = new Carte("Anna Karenina", "  Lev Tolstoi" ,85621364 , 259);
        Carte voinaIMir = new Carte("Voina I Mir ", "  Fiodor Dostoevski" ,523214 , 632);

        Stoc magazinPiataCentrala = new Stoc(1, "Strada Armeneasa 44");
        Stoc magazinBuiucani = new Stoc(2, "Alba Iulia 32");

        magazinBuiucani.adaugaCarteInStoc(amintiriDinCopilarie);
        magazinBuiucani.adaugaCarteInStoc(aventurileLuiTomSawyer);
        magazinBuiucani.adaugaCarteInStoc(sherlockHolmes);

        System.out.println("In magazinul Buiucani sunt carti " + magazinBuiucani.numarDeCartiInStoculCurent());

        magazinBuiucani.stergeCarteaDinStoc(amintiriDinCopilarie);
        System.out.println("In magazinul Buiucani sunt carti " + magazinBuiucani.numarDeCartiInStoculCurent());

        magazinBuiucani.afiseazaCartileDinStoc();
        System.out.println(magazinBuiucani.esteStoculGol());
        System.out.println(magazinBuiucani.existaCarteaInAcestStoc(amintiriDinCopilarie));
        System.out.println(magazinBuiucani.existaCarteaInAcestStoc(sherlockHolmes));

    }
}
