package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//ֲûחמג new Object().notify() הכÿ synchronized(new Object()).
public class NewObject {
    public static void main(String[] args) {
        synchronized (new Object()) {
            new Object().notify();
        }
    }
}
