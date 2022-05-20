package com.gerberdshild.javalanguage.detailedlookatclasses.part_01;

//Перегрузка методов. Один из принципов полиморфизма.
class Overload {
    //Перегружаемый метод с пустам списком парамтеров
    void test() {
        System.out.println("В этом перегружаемом методе нет параметров.");
    }

    //Перегружаемый метод с одним целочисленным парамтером
    void test(int a) {
        System.out.println("В этом перегружаемом методе один целочисленный параметр: " + a);
    }

    //Перегружаемый метод с двумя целочисленными параметрами.
    void test(int a, int b) {
        System.out.println("Перегружаемый метод с двумя целочисленными параметрами. a = " + a + " b = " + b);
    }

    //Перегружаемый метод с одним вещественным параметром типа double.
    double test(double a) {
        System.out.println("Перегружаемый метод с одним вещественным параметром типа double. a = " + a);
        return a * a;
    }

}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        double result;
        //вызывем все варианты перегружаемых методов
        overload.test();
        overload.test(10);
        overload.test(20, 30);
        System.out.println("Результат вызова overload.test(123.123) = " + overload.test(123.123));
    }
}
