package com.gerberdshild.javalanguage.multithreadedprogramming.part_06;

public class Caller implements Runnable {
    Thread thread;
    String msg;
    Callme callme;

    Caller(Callme callme, String msg) {
        this.callme = callme;
        this.msg = msg;
        thread = new Thread(this);
        thread.start();   
    }

    @Override
    public void run() {
        callme.call(msg);
    }
    
}
