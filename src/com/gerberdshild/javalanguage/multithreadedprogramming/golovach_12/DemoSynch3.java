package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_12;

//≈сли synchronized у блока кода части метода hello(), то оба потока залетают в метод hello().
//ќдин сразу начинает выполн€ть блок synchronized.
//¬торой ждет 3сек и залетает в synchronized блок метода hello().
public class DemoSynch3 {
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
        System.out.println(id + ": I'm here in A" );
        synchronized(DemoSynch2.class) {
            System.out.println(id + ": I'm here in B" );
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ignore) {/*NOP*/}
        }
    }
}

