package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_12;

//���� synchronized ������������, �� �������� ����� wait(), �� ��� ������ ������ � ����� hello();
//C ����� ������ ���������� ������ ����� ����������� � wait(3000)
//B c ����� ������ ������ ������� synchronized ����� hello()
//������� ������ ����� ���� ������ ��������� ����� hello()

public class DemoSynch4 {
    public static void main(String[] args) {
        Thread thread1;
        thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                hello(1);
            }
        });

        Thread thread2;
        thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                hello(2);
            }
        });

        thread1.start();
        thread2.start();
    }

    public static synchronized void hello(int id) {
        System.out.println(id + ": I'm here" );
        try {
            DemoSynch4.class.wait(3000);
        } catch (InterruptedException ignore) {/*NOP*/}
    }
}

