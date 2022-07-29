package com.gerberdshild.javalanguage.multithreadedprogramming.part_08;

//Очередь - буфер по факту.
public class Q {
    private int n;

    public synchronized void put(int n) {
        this.n = n;
        System.out.println("Sent by: " + n);
    }

    public synchronized int get() {
        System.out.println("Received: " + n);
        return n;
    }
}
