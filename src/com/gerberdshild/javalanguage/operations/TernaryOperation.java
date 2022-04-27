package com.gerberdshild.javalanguage.operations;

//Тернарная операция.
public class TernaryOperation {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолбтное значение " + i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолбтное значение " + i + " равно " + k);
    }
}
