package com.gerberdshild.javalanguage.multithreaded_programming.golovach_05;

//Пример залоченного потока. Поток ожидает завершения себя самого.
public class DeadlockOne {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Поток " + Thread.currentThread().getName() + " ждёт завершения самого себя.");
        Thread.currentThread().join();
    }
}
