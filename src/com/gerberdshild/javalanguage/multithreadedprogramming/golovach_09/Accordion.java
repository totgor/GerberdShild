package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_09;

//��������� ���������. ������������ �������.
public class Accordion {
    public static void main(String[] args) throws InterruptedException {
        Scheduler scheduler = new Scheduler();
        scheduler.start();
        scheduler.join();
        System.out.println("��� ������ ���������. ��������� ���������.");
    }
}
