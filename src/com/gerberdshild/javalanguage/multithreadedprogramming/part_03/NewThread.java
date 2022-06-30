package com.gerberdshild.javalanguage.multithreadedprogramming.part_03;

//Пример создания потока через расширение класса Thread.
public class NewThread extends Thread {
    NewThread() {
        super("Дочерний поток.");
        System.out.println("Дочерний поток создан: " + this);
        this.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершён.");
    }
}
