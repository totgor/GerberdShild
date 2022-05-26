package com.gerberdshild.javalanguage.detailedlookatclasses.part_19;

//Пример передачи аргументов переменной длины.
public class PassArgumentsVarLength {
    static void printVarArguments(int ... arrayArguments) {
        System.out.print("Колличество аргументов: " + arrayArguments.length + " Содержимое: ");
        for (int variable : arrayArguments) {
            System.out.print(variable + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printVarArguments(13);
        printVarArguments(4, 34, 65, -34, 8);
        printVarArguments();
    }
}
