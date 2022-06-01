package com.gerberdshild.javalanguage.inheriting.part_11;

//Если сигнатуры отличаются, то это уже перегрузка метода.
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

    void show(String msg) {
        System.out.println(msg);
        System.out.println("k = " + k);
    }
}

public class Override3 {
    public static void main(String[] args) {
        B b = new B(1, 2, 3);
        b.show("Это к:"); //Эта строка выводит сообщение и значение k
        b.show(); //эта строка выводит значения i и j
    }
}
