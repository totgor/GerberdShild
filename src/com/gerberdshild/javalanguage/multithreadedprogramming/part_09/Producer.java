package com.gerberdshild.javalanguage.multithreadedprogramming.part_09;

//Класс "Поставщик"
public class Producer implements Runnable {
    Q q;
    int i = 0;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        while(true) {            
            q.put(i++);
        }        
    }
}
