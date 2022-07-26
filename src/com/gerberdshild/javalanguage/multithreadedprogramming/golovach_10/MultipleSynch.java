package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//По одному объекту миожно засинхронизироваться много раз.
public class MultipleSynch {
    public static void main(String[] args) throws InterruptedException {
        Object ref = MultipleSynch.class;
        synchronized (ref) {
            synchronized (ref) {
                synchronized (ref) {
                    ref.wait();
                }
            }
        }
    }
}
