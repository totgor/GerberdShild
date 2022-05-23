package com.gerberdshild.javalanguage.detailedlookatclasses.part_09;

//Рекурсивный вывод значений массива.
class Array {
    int[] array;

    //аоздаем массив размерностью i
    Array(int i) {
        array = new int[i];
    }

    //рекурсивный вывод значений массива
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] = " + array[i - 1]);
    }
}

public class RecursionPrintArray {
    public static void main(String[] args) {
        Array myArray = new Array(10); //создаем объект с массивом размерностью 10
        for (int i = 0; i < 10; i++) myArray.array[i] = i; //инициализируем занчения массива
        myArray.printArray(10); //рекурсивный вывод значений массива
    }
}
