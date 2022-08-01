package com.gerberdshild.javalanguage.multithreaded_programming.part_10;

public class B {
    synchronized void first(A a) {
        try {
            System.out.println(Thread.currentThread().getName() + " в методе B.first()");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " в классе B прерван.");
        }
        System.out.println(Thread.currentThread().getName() + " попытается вызвать метод a.second() и попадёт в блокировку.");
        a.second();
    }

    synchronized void second() {
        System.out.println(Thread.currentThread().getName() + " в методе B.second()");
    }
}