package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//������������������ ����� �� ������ �������� � ������� ������ ���. �������� ������ wait(), notify() ����� ������� ������ ���.
public class RefObjectSynch2 {
    public static void main(String[] args) throws InterruptedException {
        Object ref0 = new Object();
        Object ref1 = new Object();

        synchronized (ref0) {
            synchronized (ref1) {
                ref0.notify();
                ref0.notify();
                ref0.notify();
                ref1.notify();
                ref1.wait();
                ref1.wait();
            }
        }
    }
}