package com.gerberdshild.javalanguage.multithreaded_programming.golovach_06;

//Пример двух залоченных потоков. Первый поток ждёт завершения работы второго. Второй поток ждёт завершения работы первого.
public class DeadlockTwo {
    public static void main(String[] args) {
        Thread[] threads = new Thread[2];

        threads[0] = new Thread(new Runnable() {
            public void run() {
                System.out.println("threads[0] join to threads[1]");
                try {
                    threads[1].join();
                } catch (InterruptedException ignore) {
                }
            }
        });

        threads[1] = new Thread(new Runnable() {
            public void run() {
                System.out.println("threads[1] join to threads[0]");
                try {
                    threads[0].join();
                } catch (InterruptedException ignore) {
                }
            }
        });
        //вызов start() не равен вызову метода, это лишь сообщение для ОС, что этот поток готов к выполнению, 
        //далее планировщик ОС выбирает когда какому потоку стартовать, в зависимости от наличия свободных ядер
        threads[0].start();
        threads[1].start();

    }
}
