package com.gerberdshild.javalanguage.multithreadedprogramming.part_04;

public class MultiThreadDemo {
 public static void main(String[] args) {
    new NewThread("Один");
    new NewThread("Два");
    new NewThread("Три");

    try {
        Thread.sleep(10000);//ждём завершения работы всех потоков
    } catch (InterruptedException e) {
        System.out.println("Главный поток прерван.");
    }
    System.out.println("Главный поток завершён.");
 }   
}
