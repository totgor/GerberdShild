package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_11;

//���� ������ � �������.
public class ProducerConsumerTest {
    public static void main(String[] args) throws InterruptedException {
        SingleElementBuffer buffer = new SingleElementBuffer();
        new Thread(new Producer(buffer, 100, 1000)).start();
        new Thread(new Producer(buffer, 1, 1500)).start();
        Thread.sleep(5000);
        new Thread(new Consumer(buffer)).start();
    }
}
