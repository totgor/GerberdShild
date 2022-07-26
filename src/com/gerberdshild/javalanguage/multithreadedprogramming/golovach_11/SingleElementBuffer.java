package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_11;

//Буфер с одной ячейкой для Integer.
public class SingleElementBuffer {
    private Integer elem = null;

    public synchronized void put(Integer elem) throws InterruptedException {
        //Если предидущий элемент из буфера не забрали, то ждём на методе put()
        while(this.elem != null) {
            this.wait();
        }
        this.elem = elem;
        this.notifyAll(); //уведомить, что элемент положили.
    }

    public synchronized Integer get() throws InterruptedException {
        //Пока элемент отсутствует в буфере ждём на методе get().
        while(elem == null) {
            this.wait();
        }
        Integer result = elem;
        elem = null;
        this.notifyAll(); //уведомить, что элемент забрали.
        return result;
    }
}
