package com.gerberdshild.javalanguage.multithreadedprogramming.part_08;

//������������ ���������� ���������� � �����������.
public class TestQ {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q, 1);
        Consumer consumer = new Consumer(q);
    }
}
