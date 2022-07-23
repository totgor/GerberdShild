package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_07;

public class PrintRunnable implements Runnable {
    private String msg;
    private long sleepMillisec;

    PrintRunnable(String msg, long sleepMillisec) {
        this.msg = msg;
        this.sleepMillisec = sleepMillisec;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(sleepMillisec);
            } catch (InterruptedException e) {
                System.out.println("Прервался дочерний поток вывода подстроки с цифрой: " + Thread.currentThread().getName());
            }
            System.out.println(msg);
        }
    }
}
