package com.gerberdshild.javalanguage.inheriting.part_14;

//Простой пример абстрактного класса.
abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("Это конкретный мтеод в абстарктном классе A.");
    }
}

class B extends A {
    void callme() {
        System.out.println("Это обязательный, переопределённый, абстрактынй метод в подклассе B.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
