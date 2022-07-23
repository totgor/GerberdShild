package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_08;

//Демографический взрыв. Каждый из трех порождаемых потоков, порождает свои три потока, эти в свою очередь свои три потока и так до бесконечности.
public class PopulationExplosion {
    public static void main(String[] args) {
        new Thread(new SpawnThreeThreadRunnable("", 1)).start();
    }
}