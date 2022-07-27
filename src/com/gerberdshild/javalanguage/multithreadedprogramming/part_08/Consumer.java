package com.gerberdshild.javalanguage.multithreadedprogramming.part_08;

public class Consumer implements Runnable {
    private Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}
