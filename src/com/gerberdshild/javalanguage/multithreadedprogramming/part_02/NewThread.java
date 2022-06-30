package com.gerberdshild.javalanguage.multithreadedprogramming.part_02;

//Второй поток исполнения
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Демонстрационный дочерний поток.");
        System.out.println("Дочерний поток создан: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение дочернего потока.");
        }
        System.out.println("Дрчерний поток завершён.");
    }
}
