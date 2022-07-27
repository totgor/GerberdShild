package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_14;

//����� ������ ������� ������ � synchronized �����, ��������� ������ ���������� � ��������� (Blocked - Set).
//�.�. ������ ����� ������������ ������� - synchronized ������� � �������� ��� ����������.
//����� ���������� ������ ������� ������ ������� ������������� � �������� ����������.
//������ ����������� ����������� ������ ������� ������ ���������� � ������������ ������� ����� �� Blocked-Set � �������� ��� ����������.
//� ��� ���� ��� ������ � Blocked Set �� �������� ���� ������.
public class BlockedSet {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int tmp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    hello(tmp);
                }
            }).start();
        }
    }

    public static synchronized void hello(int id) {
        System.out.println(id + ": I'm here.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {/*NOP*/}
    }
}
