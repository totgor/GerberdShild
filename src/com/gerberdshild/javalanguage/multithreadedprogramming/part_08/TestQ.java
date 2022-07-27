package com.gerberdshild.javalanguage.multithreadedprogramming.part_08;

//Неправиьлная реализация поставщика и потребителя.
public class TestQ {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q, 1);
        Consumer consumer = new Consumer(q);
    }
}
