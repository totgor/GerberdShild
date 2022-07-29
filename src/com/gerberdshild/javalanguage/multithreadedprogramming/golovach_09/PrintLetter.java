package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_09;

public class PrintLetter implements Runnable {
    private String msg;
    private long milliSecond;

    PrintLetter(String msg, long milliSecond) {
        this.msg = msg;
        this.milliSecond = milliSecond;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(msg);
            try {
                Thread.sleep(milliSecond);
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван.");
            }
        }
    }
}
