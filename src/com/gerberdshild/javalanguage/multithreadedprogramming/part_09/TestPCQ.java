package com.gerberdshild.javalanguage.multithreadedprogramming.part_09;

//Правильная реализация поставщика потребителя.
public class TestPCQ {
    public static void main(String[] args) {
        Q q = new Q();

        new Producer(q);
        new Consumer(q);
    }
}
