package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_10;

//����� new Object().notify() ��� synchronized(new Object()).
public class NewObject {
    public static void main(String[] args) {
        synchronized (new Object()) {
            new Object().notify();
        }
    }
}
