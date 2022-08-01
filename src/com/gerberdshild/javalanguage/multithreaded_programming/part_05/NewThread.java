package com.gerberdshild.javalanguage.multithreaded_programming.part_05;

public class NewThread implements Runnable {
    Thread thread;
    String name;

    NewThread(String name){
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("Новый поток: " + thread + " создан.");
        thread.start();        
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершён.");
    }
}
