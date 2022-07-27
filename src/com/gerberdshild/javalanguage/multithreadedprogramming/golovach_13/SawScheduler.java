package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_13;

//Загрузка процессора каждые 5 сек.
public class SawScheduler {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            System.out.println("sleep");
            Thread.sleep(5000); //здесь поток разгружается
            System.out.println("wakeup");
            double d = 2.0;
            //здесь поток занимается вычислением 50млн sin
            for (int i = 1; i < 50_000_000; i++) {
                d = Math.sin(d);
            }
        }
    }
}
