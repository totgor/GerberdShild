package com.gerberdshild.javalanguage.inheriting.part_12;

//Динамическая диспетчиризация методов.
class A {
    void callme() {
        System.out.println("Метод callme() из класса А.");
    }
}

class B extends A {
    //переопределить метод callme()
    void callme() {
        System.out.println("Метод callme() из класса B.");
    }
}

class C extends A {
    //переопределить метод callme()
    void callme() {
        System.out.println("Метод callme() из класса C.");
    }
}

public class DinamicDispatchingMethods {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A refA; //ссылка на объекты типа A

        refA = a;
        refA.callme(); //вызывается метод callme() и тип ссылки и тип данных идентичны

        refA = b;
        refA.callme(); //вызывается метод callme() по типу данных b, а не по типу переменной refA

        refA = c;
        refA.callme(); //вызывается метод callme() по типу данных c, а не по типу переменной refA
    }
}
