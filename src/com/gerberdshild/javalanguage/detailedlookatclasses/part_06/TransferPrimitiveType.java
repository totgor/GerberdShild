package com.gerberdshild.javalanguage.detailedlookatclasses.part_06;

//Аргументы примитивных типов передаются по значению.
class Test {
    //изменить значения передаваемых аргуемнтов
    void calc(int a, int b) {
        a *= 2;
        b /= 2;
    }
}

public class TransferPrimitiveType {
    public static void main(String[] args) {
        Test test = new Test();
        int a = 15;
        int b = 20;
        System.out.println("Значения a и b до вызова: " + a + " " + b);
        test.calc(a, b);
        System.out.println("Значения a и b после вызова: " + a + " " + b);
    }
}
