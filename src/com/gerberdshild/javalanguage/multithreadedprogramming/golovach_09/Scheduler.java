package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_09;

public class Scheduler extends Thread {
    private Thread printLetter1;
    private Thread printLetter2;
    private Thread printLetter3;

    public void run() {
        for(int i = 0; i < 10; i++) {
            printLetter1 = new Thread(new PrintLetter("A   .", 100));
            printLetter2 = new Thread(new PrintLetter(".   B", 99));
            printLetter1.start();
            printLetter2.start();
            try {
                printLetter1.join();
                printLetter2.join();
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван.");
            }
            printLetter3 = new Thread(new PrintLetter("  C", 100));
            printLetter3.start();
            try {
                printLetter3.join();
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван.");
            }
        }
    }
}
