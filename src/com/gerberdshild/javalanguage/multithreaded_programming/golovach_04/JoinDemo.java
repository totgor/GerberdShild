package com.gerberdshild.javalanguage.multithreaded_programming.golovach_04;

//Пример использования join().
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread newThread = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    stillyWork();
                    System.out.println("Закончили " + i + " блок stillyWork() в " + Thread.currentThread().getName());
                }
            }
        });
        newThread.start();

        for (int i = 0; i < 3; i++) {
            stillyWork();
            System.out.println("Закончили " + i + " блок stillyWork() в " + Thread.currentThread().getName());
        }
        
        //ждём окончания работы потока newThread
        newThread.join();

        System.out.println("That's All!");
    }

    static void stillyWork() {
        double d = 2.0;
        for (int i = 0; i < 50_000_000; i++) {
            d = Math.sin(d);
        }
    }
}
