package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//������������������ ���� � ������ wait() � notify().
public class CallNotifyWaitSynchBlock {
    public static void main(String[] args) throws InterruptedException {
        synchronized (CallNotifyWaitSynchBlock.class) {
            //notify() ��� �������� ������
            CallNotifyWaitSynchBlock.class.notify();
            //wait() ��� �������� ������ ����� ������ ���� Object
            Object CallNotifyClass = CallNotifyWaitSynchBlock.class;
            CallNotifyClass.wait();
        }
    }
}