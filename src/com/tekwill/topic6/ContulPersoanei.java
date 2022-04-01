package com.tekwill.topic6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;

public class ContulPersoanei {
    private String numePersoana;
    private int id;
    private double sumaCurenta;

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSumaCurenta(double sumaCurenta) {
        if (sumaCurenta > 0) {
            this.sumaCurenta = sumaCurenta;
        } else System.out.println("Nu este posibil de avut sold negativ");
    }


    public String getNumePersoana() {
        return this.numePersoana;
    }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public int getId() {
        return id;
    }

    public double sustragereDeBani(double sumaExtrasa) {
        if (sumaExtrasa > sumaCurenta) {
            System.out.println("Sold insuficient");
        }
        return (sumaCurenta - sumaExtrasa);
    }

    public double imparteSoldulLaNPersoane(int numarDePersoane) {
        int result = 0;
        try {
            result = (int) sumaCurenta / numarDePersoane;

        } catch (ArithmeticException exceptieObiect) {
            System.out.println("Ai introdus valoarea 0");
            exceptieObiect.printStackTrace();
        }
        return result;
    }

    public void transferCatreOPersoanaACareiDateSuntIntrunFisierAruncare(String directoriuCuFisierDat) throws FileNotFoundException {
        File datelePentruTransfer001 = new File(directoriuCuFisierDat);
        FileReader fileReader001 = new FileReader(datelePentruTransfer001);
    }

    public void transferCatreOPersoanaACareiDateSuntIntrunFisierTratare(String directoriuCuFisierDat) {
        File datelePentruTransfer001 = new File(directoriuCuFisierDat);
        try {

            FileReader fileReader001 = new FileReader(datelePentruTransfer001);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Please review the entered data");
        } finally {
            System.out.println("Acest cod ruleaza indiferent ce ce se intimpla mai sus");

        }
    }
}
