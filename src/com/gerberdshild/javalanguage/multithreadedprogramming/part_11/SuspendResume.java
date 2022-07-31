package com.gerberdshild.javalanguage.multithreadedprogramming.part_11;

//Проверяем работу приостановления и возобновление исполнения потоков современным способом.
public class SuspendResume {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("Поток один");
        NewThread obj2 = new NewThread("Поток два");
        try {
            Thread.sleep(5000);
            obj1.mySuspend();
            System.out.println("Приостановлен: " + obj1.name);
            Thread.sleep(5000);
            obj1.myResume();
            System.out.println("Возобнавлён: " + obj1.name);
            obj2.mySuspend();
            System.out.println("Приостановлен: " + obj2.name);
            Thread.sleep(5000);
            obj2.myResume();
            System.out.println("Возобнавлён поток: " + obj2.name);

        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        // дожидаемся исполнения всех потоков
        try {
            obj1.thread.join();
            obj2.thread.join();

        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершён.");
    }
}
