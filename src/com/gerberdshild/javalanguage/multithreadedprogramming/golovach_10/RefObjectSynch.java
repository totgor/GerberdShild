package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//������������� ���������� �� ������� �� �� ������.
public class RefObjectSynch {
    public static void main(String[] args) throws InterruptedException {
        Object ref0 = new Object();
        Object ref1 = ref0;
        synchronized (ref0) {
            ref1.wait();
        }
    }
}
