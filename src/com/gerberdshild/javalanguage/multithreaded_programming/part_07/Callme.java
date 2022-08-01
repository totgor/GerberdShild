package com.gerberdshild.javalanguage.multithreaded_programming.part_07;

public class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);            
        } catch (InterruptedException e) {
            System.out.println("Метод call() прерван.");
        }
        System.out.println("]");
    }
}
