package com.gerberdshild.javalanguage.detailedlookatclasses.part_07;

//Объекты в качестве аргументов передаются по ссылке.
class Test {
    int a, b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void calc(Test test) {
        test.a *= 2;
        test.b /= 2;
    }
}

public class TransferObjectType {
    public static void main(String[] args) {
        Test test = new Test(15, 30);
        System.out.println("Значения test.a и test.b до вызова: " + test.a + " " + test.b);
        test.calc(test); //применение метода объекта к самому же объекту
        System.out.println("Значения test.a и test.b после вызова: " + test.a + " " + test.b);
    }
}
