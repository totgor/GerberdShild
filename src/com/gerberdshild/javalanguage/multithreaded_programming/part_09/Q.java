package com.gerberdshild.javalanguage.multithreaded_programming.part_09;

//Класс буфер
public class Q {
    int n = 0;
    boolean valueSet = false;
        
    synchronized void put(int n) {
        while (valueSet == true) {
            try {
                wait();
            } catch (InterruptedException ignore) {
                /* NOP */}
        }
        this.n = n;
        System.out.println("Отправлено: " + n);
        valueSet = true;
        notify();
    }

    synchronized int get() {
        while (valueSet == false) {
            try {
                wait();
            } catch (InterruptedException ignore) {
                /* NOP */}
        }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        return n;
    }
}
