package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//������������������ ����� � ������ wait() � notify().
public class CallNotifyWaitSynchMethod {
    public static synchronized void main(String[] args) throws InterruptedException {
        Object ref = CallNotifyWaitSynchMethod.class;
        ref.notify();

        CallNotifyWaitSynchMethod.class.wait();
    }
}
