package com.gerberdshild.javalanguage.detailedlookatclasses.part_09;

//Пример рекурсии, для вычисления факториала.
class Factorial {
    int factorial(int n) {
        if (n == 1) return 1;
        else return (factorial(n - 1) * n);
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Факториад 3 = " + factorial.factorial(3));
        System.out.println("Факториад 3 = " + factorial.factorial(4));
        System.out.println("Факториад 3 = " + factorial.factorial(5));
        System.out.println("Факториад 3 = " + factorial.factorial(6));
    }
}
