package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_11;

//����� � ����� ������� ��� Integer.
public class SingleElementBuffer {
    private Integer elem = null;

    public synchronized void put(Integer elem) throws InterruptedException {
        //���� ���������� ������� �� ������ �� �������, �� ��� �� ������ put()
        while(this.elem != null) {
            this.wait();
        }
        this.elem = elem;
        this.notifyAll(); //���������, ��� ������� ��������.
    }

    public synchronized Integer get() throws InterruptedException {
        //���� ������� ����������� � ������ ��� �� ������ get().
        while(elem == null) {
            this.wait();
        }
        Integer result = elem;
        elem = null;
        this.notifyAll(); //���������, ��� ������� �������.
        return result;
    }
}
