package com.tekwill.topic6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ContulPersoanei contul001 = new ContulPersoanei();
        contul001.setId(10001);
        contul001.setNumePersoana("Mehe John");
        contul001.setSumaCurenta(3001.25);
        double soldRamasDupaExtragere = contul001.sustragereDeBani(5000);

        System.out.println("Introduceti numarul de persoane: ");
        Scanner cititor = new Scanner(System.in);
        int numarDePersoane = cititor.nextInt();
        System.out.println("Soldul curent impartit la " + numarDePersoane + " persoane = " + contul001.imparteSoldulLaNPersoane(numarDePersoane));

        contul001.transferCatreOPersoanaACareiDateSuntIntrunFisierAruncare("D:\\tekwill\\currentTask\\lesson6\\src\\com\\tekwill\\topic5\\Cerc.java");
        contul001.transferCatreOPersoanaACareiDateSuntIntrunFisierTratare("D:\\tekwill\\currentTask\\lesson6\\src\\com\\tekwill\\topic5\\Cerc.java");


    }


}
