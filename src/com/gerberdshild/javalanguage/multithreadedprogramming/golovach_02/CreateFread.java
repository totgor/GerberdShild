package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_02;

//Создание двух потоков выполняющих работу, один из которых создан посредствам анонимного класса.
public class CreateFread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    sillyWork();                    
                    System.out.println("End " + Thread.currentThread().getName() + " " + i);
                }                
            }
        }).start();
        

        for (int i = 0; i < 5; i++) {
            sillyWork();
            System.out.println("End " + Thread.currentThread().getName() +  " " + i);   
        }        
    }

    private static void sillyWork() {
        double d = 2.0;
        for (int i = 0; i < 50_000_000; i++) {
            d = Math.sin(d);
        }
    }
}
