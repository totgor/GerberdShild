package com.gerberdshild.javalanguage.multithreaded_programming.golovach_10;

//Синхронизация происходит по объекту не по ссылке.
public class RefObjectSynch {
    public static void main(String[] args) throws InterruptedException {
        Object ref0 = new Object();
        Object ref1 = ref0;
        synchronized (ref0) {
            ref1.wait();
        }
    }
}
