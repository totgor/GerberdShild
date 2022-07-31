package com.gerberdshild.javalanguage.multithreadedprogramming.part_11;

//Приостановка и возобновление исполнения потка современным способом.
public class NewThread implements Runnable {
    Thread thread;
    String name;    
    private boolean suspendFlag;

    NewThread(String name) {
        this.name = name;
        suspendFlag = false;
        thread = new Thread(this, name);
        thread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 15; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
                //до тех пор пока стоит флаг приостановки - поток приостанавливается в цикле
                synchronized(this) {
                    while(suspendFlag == true)
                        wait();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
    }

    public synchronized void mySuspend() {
        suspendFlag = true;
    }

    public synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}
