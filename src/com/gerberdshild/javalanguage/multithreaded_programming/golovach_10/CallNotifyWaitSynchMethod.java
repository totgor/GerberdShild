package com.gerberdshild.javalanguage.multithreaded_programming.golovach_10;

//Синхронизированный метод и методы wait() и notify().
public class CallNotifyWaitSynchMethod {
    public static synchronized void main(String[] args) throws InterruptedException {
        Object ref = CallNotifyWaitSynchMethod.class;
        ref.notify();

        CallNotifyWaitSynchMethod.class.wait();
    }
}
