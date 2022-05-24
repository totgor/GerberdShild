package com.gerberdshild.javalanguage.detailedlookatclasses.part_11;

//Пример использования static - статических переменных и методов в классе.
class StaticDemo {
    static int a = 38;
    static int b = 160;

    static void printA() {
        System.out.println("a = " + a);
    }
}

public class StaticClass2 {
    public static void main(String[] args) {
        StaticDemo.printA();
        System.out.println("b = " + StaticDemo.b);
    }
}
