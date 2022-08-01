package com.gerberdshild.javalanguage.multithreaded_programming.part_07;

public class Caller implements Runnable {
    Thread thread;
    Callme callme;
    String msg;

    Caller(Callme callme, String msg) {
        this.callme = callme;
        this.msg = msg;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        synchronized(callme) {
            //синхронизированный блок
            callme.call(msg);
        }
     }    
}
