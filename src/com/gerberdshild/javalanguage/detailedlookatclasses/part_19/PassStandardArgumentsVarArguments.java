package com.gerberdshild.javalanguage.detailedlookatclasses.part_19;

//Пример передачи стандартных аргументов и аргументов переменной длины.
public class PassStandardArgumentsVarArguments {
    static void printArguments(String message, int ... arrayArguments) {
        System.out.print(message + arrayArguments.length + " Содержимое: ");
        for (int value : arrayArguments) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArguments("Один аргумент переменной длины: ", 13);
        printArguments("Пять аргументов переменной длины: ", 3, 45, 2, 2345, - 12);
        printArguments("Нет аргументов переменной длины: ");
    }
}
