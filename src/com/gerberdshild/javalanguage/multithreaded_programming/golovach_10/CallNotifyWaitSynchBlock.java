package com.gerberdshild.javalanguage.multithreaded_programming.golovach_10;

//Синхронизированный блок и методы wait() и notify().
public class CallNotifyWaitSynchBlock {
    public static void main(String[] args) throws InterruptedException {
        synchronized (CallNotifyWaitSynchBlock.class) {
            //notify() для текущего класса
            CallNotifyWaitSynchBlock.class.notify();
            //wait() для текущего класса через ссылку типа Object
            Object CallNotifyClass = CallNotifyWaitSynchBlock.class;
            CallNotifyClass.wait();
        }
    }
}