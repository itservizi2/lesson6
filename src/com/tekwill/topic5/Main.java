package com.tekwill.topic5;

public class Main {
    public static void main(String[] args) {
        Cerc cercTudor = new Cerc();
        Patrat patratCarol = new Patrat(10.5);
        Romb rombRosanna = new Romb();

        cercTudor.setRazaCercului(9.1555);
        System.out.println("Aria figurii manipulate este : " + cercTudor.returneazaAria());

        patratCarol.returneazaAria();
        System.out.println("Aria figurii manipulate este : " + patratCarol.getAriaFigurii());

//        double ariaPatratuluiCarol = patratCarol.returneazaAria();
//        System.out.println("Aria figurii manipulate este : " + ariaPatratuluiCarol);

        rombRosanna.setDiagonale(30,18);
        rombRosanna.returneazaAria();
        System.out.println("Aria figurii manipulate este : " + rombRosanna.getAriaFigurii());
    }
}
