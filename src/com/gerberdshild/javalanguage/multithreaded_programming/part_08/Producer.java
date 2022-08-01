package com.gerberdshild.javalanguage.multithreaded_programming.part_08;

public class Producer implements Runnable {
    private Q q;
    private int i;

    Producer(Q q, int startNum) {
        this.q = q;
        i = startNum;
        new Thread(this, "Producer").start();
    }

    public void run() {
        while (true) {
            q.put(i++);
        }
    }
}
