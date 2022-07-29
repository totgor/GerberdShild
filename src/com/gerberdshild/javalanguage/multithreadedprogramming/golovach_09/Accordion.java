package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_09;

//Программа аккордион. Чередующиеся символы.
public class Accordion {
    public static void main(String[] args) throws InterruptedException {
        Scheduler scheduler = new Scheduler();
        scheduler.start();
        scheduler.join();
        System.out.println("Все потоки завершены. Программа завершена.");
    }
}
