package com.gerberdshild.javalanguage.inheriting.part_09;

//Переопределение метода.
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

    //этот вариант метода  show() переопределяет и сркывает вариант show() из суперкласса.
    void show() {
        System.out.println("k = " + k);
    }
}

public class Override1 {
    public static void main(String[] args) {
        B b = new B(1, 2, 3);
        b.show();
    }
}
