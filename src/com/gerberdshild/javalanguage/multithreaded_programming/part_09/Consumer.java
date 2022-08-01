package com.gerberdshild.javalanguage.multithreaded_programming.part_09;

//Класс "Потребитель"
public class Consumer implements Runnable{
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while(true) {
            q.get();
        }
    }
    
}
