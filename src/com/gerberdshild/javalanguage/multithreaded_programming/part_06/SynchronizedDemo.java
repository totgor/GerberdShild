package com.gerberdshild.javalanguage.multithreaded_programming.part_06;

//Пример использования синхронизированного метода.
public class SynchronizedDemo {
    public static void main(String[] args) {
        Callme callme = new Callme();

        Caller caller1 = new Caller(callme, "Добро пожаловать");
        Caller caller2 = new Caller(callme, "в синхронизированный");
        Caller caller3 = new Caller(callme, "мир!");

        try {
            caller1.thread.join();
            caller2.thread.join();
            caller3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
    }
}