package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//Синхронизироваться можно по разным объектам и сколько угодно раз. Вызывать методы wait(), notify() можно сколько угодно раз.
public class RefObjectSynch2 {
    public static void main(String[] args) throws InterruptedException {
        Object ref0 = new Object();
        Object ref1 = new Object();

        synchronized (ref0) {
            synchronized (ref1) {
                ref0.notify();
                ref0.notify();
                ref0.notify();
                ref1.notify();
                ref1.wait();
                ref1.wait();
            }
        }
    }
}
