package com.gerberdshild.javalanguage.multithreadedprogramming.part_06;

public class Callme {
    //Чтобы доступ к методу разрешить только по очереди, необходимо использовать ключеове слово synchronized
    synchronized void call(String msg) {
        try {
            System.out.print("[" + msg);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Метод сall() был прерван.");
        }
        System.out.println("]");
    }
}
