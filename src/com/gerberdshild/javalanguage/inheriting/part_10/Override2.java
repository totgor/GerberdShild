package com.gerberdshild.javalanguage.inheriting.part_10;

//Переопредление метода. Как вызвать одноименный метод из суперкласса.
class A {
    int i, j;

    A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}

class B extends A {
    int k;

    B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        super.show();
        System.out.println("k = " + k);
    }
}

public class Override2 {
    public static void main(String[] args) {
        B b = new B(1, 2, 3);
        b.show();
    }
}

