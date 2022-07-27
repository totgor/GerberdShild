package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_12;

//Если synchronized отсутствует, то оба потока одновременно залетают в метод.
public class DemoSynch {
    public static void main(String[] args) {
        Thread thread1;
        thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                hello(1);
            }
        });

        Thread thread2;
        thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                hello(2);
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void hello(int id) {
        System.out.println(id + ": I'm here" );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignore) {/*NOP*/}
    }
}
