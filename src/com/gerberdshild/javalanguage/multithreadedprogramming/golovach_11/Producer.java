package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_11;

//Класс порождающий элементы для буфера.
public class Producer implements Runnable {
    private SingleElementBuffer buffer;
    private Integer startElem;
    private long milliSecond;

    Producer(SingleElementBuffer buffer, Integer startElem, long milliSecond) {
        this.buffer = buffer;
        this.startElem = startElem;
        this.milliSecond = milliSecond;
    }

    public void run() {
        //в вечном цикле производим элементы для буфера
        while(true) {
            try {
                System.out.println("producer: " + startElem);
                buffer.put(startElem++);
                Thread.sleep(milliSecond);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " прерван.");
                break;
            }
        }
    }
}
