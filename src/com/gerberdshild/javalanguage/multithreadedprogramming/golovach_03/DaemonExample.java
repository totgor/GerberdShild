package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_03;

//JVM завершает работу программы тогда, когда умерли все потоки - не демоны.
public class DaemonExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                while(true){ /*вечный цикл*/}
            }    
        });
        thread.setDaemon(false);  //Т.к. вторйо поток не демон,  второй поток будет выполняться вечно, программа не будет завершена
        // thread.setDaemon(true); //Т.к. второй поток является демоном, то по завершении главного потока main() программа завершит свою работу и прервет все потоки демоны
        thread.start();
        System.out.println("Последняя команда в main() выполнена.");
        //System.exit(42);F
    }
    
}
