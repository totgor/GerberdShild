package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_11;

//Класс потребляющий элементы из буфера.
public class Consumer implements Runnable {
    private SingleElementBuffer buffer;
    private Integer elem;

    Consumer(SingleElementBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while(true){
            try {
                elem = buffer.get();
                System.out.println("consumer: " + elem);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "прерван.");
                break;
            }
        }
    }
}
