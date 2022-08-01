package com.gerberdshild.javalanguage.detailed_look_at_classes.part_20;

//Неоднозначность и аргументы переменной длины.
public class AmbiguityArgumentsVarLength {
    static void printArguments(int... arrayArguments) {
        System.out.print("Колличество аргументов переменной длины: " + arrayArguments.length + " Содержимое: ");
        for (int value : arrayArguments)
            System.out.print(value + " ");
        System.out.println();
    }

    static void printArguments(boolean... arrayArguments) {
        System.out.print("Колличество аргументов переменной длины: " + arrayArguments.length + " Содержимое: ");
        for (boolean value : arrayArguments)
            System.out.print(value + " ");
        System.out.println();
    }

    /*
    static void printArguments(int val, int... arrayArguments) {
        System.out.print("Колличество аргументов переменной длины: " + arrayArguments.length + " Содержимое: ");
        for (int value : arrayArguments)
            System.out.print(value + " ");
        System.out.println();
    }
    */

    public static void main(String[] args) {
        printArguments(1, 2, 3); //вторая неоднозначность! в случае присутствия метода static void printArguments(int val, int... arrayArguments);
        printArguments(false, true, true);
        //printArguments(); //первая неоднозначность!
    }
}
