package com.gerberdshild.javalanguage.multithreadedprogramming.part_10;

public class A {
    synchronized void first(B b) {
        try {
            System.out.println(Thread.currentThread().getName() + " в методе A.first()");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " в классе A прерван.");
        }
        System.out.println(Thread.currentThread().getName() + " попытается вызвать метод b.second() и попадёт в блокировку.");
        b.second();
    }

    synchronized void second() {
        System.out.println(Thread.currentThread().getName() + " в методе A.second()");
    }
}
