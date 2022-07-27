package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_12;

//≈сли synchronized присутствует, но вызываем метод wait(), то оба потока зайдет в метод hello();
//C точки зрени€ синтаксиса первый поток остановилс€ в wait(3000)
//B c точки зрени€ потока тпустил synchronized метод hello()
//ѕоэтому второй поток смог начать выполн€ть метод hello()

public class DemoSynch4 {
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

    public static synchronized void hello(int id) {
        System.out.println(id + ": I'm here" );
        try {
            DemoSynch4.class.wait(3000);
        } catch (InterruptedException ignore) {/*NOP*/}
    }
}

