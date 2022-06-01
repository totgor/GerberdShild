package com.gerberdshild.javalanguage.inheriting.part_08;

//Последовательность вызова конструкторов в иерархии классов.
class A {
    A() {
        System.out.println("Вызов конструктора A.");
    }
}

class B extends A {
    B() {
        System.out.println("Вызов конструктора B.");
    }
}

class C extends B {
    C() {
        System.out.println("Вызов констурктора С.");
    }
}

public class CallingConstructors {
    public static void main(String[] args) {
        C с = new C();
    }
}
