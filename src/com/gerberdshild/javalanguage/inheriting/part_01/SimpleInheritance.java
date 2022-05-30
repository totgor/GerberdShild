package com.gerberdshild.javalanguage.inheriting.part_01;

//Пример простого наследования.
class A {
    int i, j;

    void show_ij() {
        System.out.println("i = " + i + " j = " + j);
    }
}

class B extends A {
    int k;

    void show_k() {
        System.out.println("k = " + k);
    }

    void sum_ijk() {
        System.out.println("i + j + k = " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A myObjectA = new A();
        B myObjectB = new B();

        myObjectA.i = 10;
        myObjectA.j = 30;
        System.out.println("Содержимое myObjectA:");
        myObjectA.show_ij();
        System.out.println();
        myObjectB.i = 7;
        myObjectB.j = 8;
        myObjectB.k = 9;
        System.out.println("Содержимое myObjectB:");
        myObjectB.show_ij();
        myObjectB.show_k();
        myObjectB.sum_ijk();
    }
}
