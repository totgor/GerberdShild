package com.gerberdshild.javalanguage.multithreaded_programming.part_02;

//Пример создания дочернего потока.
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        Thread t = Thread.currentThread();
        t.setName("Главный поток.");
        System.out.println("Главный поток создан: " + t);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Перехват исключения главного потока.");
        }
        System.out.println("Главный поток завершён.");
    }
}
