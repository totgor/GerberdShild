package com.gerberdshild.javalanguage.detailedlookatclasses.part_19;

//Пример передачи массива аргументов методу. Старый подход к обработке аргументов переменной длины.
public class PassArrayArguments {
    static void printArguments(int[] arrayArguments) {
        System.out.print("Колличество аргументов: " + arrayArguments.length + " Содержимое: ");
        for (int value : arrayArguments) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]  array1 = {21};
        int[] array2 = {3, 65, 23, -12};
        int[] array3 = {};

        printArguments(array1);
        printArguments(array2);
        printArguments(array3);
    }
}
