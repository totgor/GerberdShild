package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_01;

//Создание потока посредствам анонимного класса.
public class CreateFread {
    public static void main(String[] args) {
        System.out.println("main(): " + Thread.currentThread().getName());

        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("newThread: " + Thread.currentThread().getName());
            }
        });
        newThread.start();

    }
}
