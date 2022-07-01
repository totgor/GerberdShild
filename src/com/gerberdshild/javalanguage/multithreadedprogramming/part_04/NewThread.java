package com.gerberdshild.javalanguage.multithreadedprogramming.part_04;

//
public class NewThread implements Runnable{
    Thread t;
    String name;

    NewThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Поток " + name + " создан.");
        t.start();
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
