package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_13;

//�������� ���������� ������ 5 ���.
public class SawScheduler {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            System.out.println("sleep");
            Thread.sleep(5000); //����� ����� ������������
            System.out.println("wakeup");
            double d = 2.0;
            //����� ����� ���������� ����������� 50��� sin
            for (int i = 1; i < 50_000_000; i++) {
                d = Math.sin(d);
            }
        }
    }
}
