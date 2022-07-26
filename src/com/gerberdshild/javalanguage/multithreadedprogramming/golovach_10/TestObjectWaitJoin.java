package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//Вызов new Object().wait() или .notify() или .notifyAll()- выдаст исключение IllegalMonitorException.
public class TestObjectWaitJoin {
    public static void main(String[] args) throws InterruptedException {

//        new Object().wait();
//        new Object().notify();
//        new Object().notifyAll();

        //Если синхронизировать блок кода, то программа при wait() - повиснет навсегда. При wait(1000) повиснет на 1сек.
        Object ref = new Object();
        synchronized (ref) {
            ref.wait(1000);
        }
    }
}
