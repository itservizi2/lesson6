package com.tekwill.topic3;

public class Operations {
    static void printAritmeticOperations(int a, int b) {

        System.out.println("Adunarea: " + (a +b ));
        System.out.println("Scaderea: " + (a - b));
        System.out.println("Inmultirea: " + (a * b));
        System.out.println("Impartirea: " + (a / b));
        System.out.println("Restul impartirii: " + (a % b));
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Post-increment: " + (a++));
        System.out.println("Pre-decrement: " + (--a));
        System.out.println("Post-decrement: " + (a--));
    }
    ;

    static void printLogicOperations(boolean a, boolean b) {

        System.out.println(" AND: " + (a&&b));
        System.out.println(" OR: " + (a||b));
        System.out.println(" Negatie: " + (!a));

    }
    ;

    static void printRelationarOperations(int a , int b) {
        System.out.println(" Egalitate " + (a == b));
        System.out.println(" Diferenta " + (a != b));

    }
    ;

    static void useForAndWhile(int limita) {
        int index = 10;

        while(index <= limita){
            System.out.print(index + " ");
            index++;

        }
        System.out.println("Valoarea lui index la finalul executiei while este "  + index);
        for(int i = 10; i <= limita ; i++){
            System.out.print(i + " ");
        }
        System.out.println("Ciclul for s-a executat ");
    }

    ;

}
