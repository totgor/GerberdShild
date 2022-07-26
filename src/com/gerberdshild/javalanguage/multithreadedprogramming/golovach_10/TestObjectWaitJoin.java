package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//����� new Object().wait() ��� .notify() ��� .notifyAll()- ������ ���������� IllegalMonitorException.
public class TestObjectWaitJoin {
    public static void main(String[] args) throws InterruptedException {

//        new Object().wait();
//        new Object().notify();
//        new Object().notifyAll();

        //���� ���������������� ���� ����, �� ��������� ��� wait() - �������� ��������. ��� wait(1000) �������� �� 1���.
        Object ref = new Object();
        synchronized (ref) {
            ref.wait(1000);
        }
    }
}
