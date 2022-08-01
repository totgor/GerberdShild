package com.gerberdshild.javalanguage.multithreaded_programming.golovach_10;

//Вызов new Object().notify() для synchronized(new Object()).
public class NewObject {
    public static void main(String[] args) {
        synchronized (new Object()) {
            new Object().notify();
        }
    }
}
