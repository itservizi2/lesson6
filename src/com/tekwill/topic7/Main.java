package com.tekwill.topic7;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String adresaFisierului = "D:\\tekwill\\currentTask\\lesson6\\src\\com\\tekwill\\topic7\\workfile.txt";

        String dateDeScriere = "Test Data care se scrie in fisier";
        FileManager.scriereaInformatieiInFisier(adresaFisierului, dateDeScriere);
        String dateDeScriereDinIncercarea2 = "Alte date";
        FileManager.scriereaInformatieiInFisier(adresaFisierului, dateDeScriereDinIncercarea2);

        FileManager.alipireaInformatieilaFisier(adresaFisierului, " Info 1 ");
        FileManager.alipireaInformatieilaFisier(adresaFisierului, " Info 3 ");

        String continutFisierDejaCitit = FileManager.citireaDateDinFisier(adresaFisierului);
        System.out.println(continutFisierDejaCitit);

    }
}
