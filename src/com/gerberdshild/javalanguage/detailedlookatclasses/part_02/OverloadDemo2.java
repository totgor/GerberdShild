package com.gerberdshild.javalanguage.detailedlookatclasses.part_02;

//Применение автоматического преобразования типов в перегружаемом методе.
class Overload {
    //Перегружаемый метод без параметров
    void test() {
        System.out.println("В этом перегружаемом методе параметры отсутствуют.");
    }

    //Перегружаемый метод с двумя целочисленными параметрами.
    void test(int a, int b) {
        System.out.println("Перегружаемый метод с двумя целочисленными параметрами. a = " + a + " b = " + b);
    }

    //Перегружаемый метод с одним вещественным параметрои.
    void test(double a) {
        System.out.println("Перегружаемый метод с одним вещественным параметром. a = " + a);
    }

}

public class OverloadDemo2 {
    public static void main(String[] args) {
        Overload overload = new Overload();
        int i = 88;

        overload.test();
        overload.test(10, 20);
        overload.test(123.123); //здесь вызывается вариант перегружаемого метода test(double)
        overload.test(i); //здесь вызывается вариант перегружаемого метода test(double), происходит приведение типов

    }
}
