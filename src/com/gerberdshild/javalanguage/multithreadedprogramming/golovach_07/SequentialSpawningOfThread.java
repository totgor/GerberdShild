package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_07;

//Последовательное порождение потоков. Каждый поток десять раз выводит свой номер.
public class SequentialSpawningOfThread {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            String spaces = getSpaces(i);
            Runnable printer = new PrintRunnable(spaces + i, 100);
            Thread thread = new Thread(printer);
            thread.start();
            Thread.sleep(100);
        }    
    }

    private static String getSpaces(int value) {
        String result = "";
        for (int i = 0; i < value; i++) {
            result = result + " ";
        }
        return result;
    }


}
