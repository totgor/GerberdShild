package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_13;

//Загрузка процессора каждые 5 сек.
public class SawScheduler {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            System.out.println("sleep");
            Thread.sleep(5000); //приостанавливаем действие потока на 5сек
            System.out.println("wakeup");
            double d = 2.0;
            //выполняем глупую работу вычисляя 50 млн sin
            for (int i = 1; i < 50_000_000; i++) {
                d = Math.sin(d);
            }
        }
    }
}
