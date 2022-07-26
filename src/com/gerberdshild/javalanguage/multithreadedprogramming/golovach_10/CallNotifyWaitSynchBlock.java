package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//—инхронизированный блок и методы wait() и notify().
public class CallNotifyWaitSynchBlock {
    public static void main(String[] args) throws InterruptedException {
        synchronized (CallNotifyWaitSynchBlock.class) {
            //notify() дл€ текущего класса
            CallNotifyWaitSynchBlock.class.notify();
            //wait() дл€ текущего класса через ссылку типа Object
            Object CallNotifyClass = CallNotifyWaitSynchBlock.class;
            CallNotifyClass.wait();
        }
    }
}