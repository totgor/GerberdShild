package com.gerberdshild.javalanguage.multithreaded_programming.part_08;

//Неправильная реализация поставщик и потребителя.
public class TestQ {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q, 1);
        Consumer consumer = new Consumer(q);
    }
}
