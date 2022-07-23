package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_08;

public class SpawnThreeThreadRunnable implements Runnable {
    private String msg;
    private int count;

    SpawnThreeThreadRunnable(String msg, int count) {
        this.msg = msg;
        this.count = count;
    }

    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(msg + count + ":" + i);
                Thread.sleep(1000);
                new Thread(new SpawnThreeThreadRunnable(getSpace(count + 1), count + 1)).start();
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание дочернего потока: " + Thread.currentThread().getName());
        }
    }

    private String getSpace(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + "   ";
        }
        return result;
    }
}
