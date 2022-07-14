package com.gerberdshild.javalanguage.packagesandinterfaces.part_14;

public interface IntStack {

    void push(int value);

    int pop();

    default void clear() {
        System.out.println("Метод clear() следует переопределить в реализующем интерфейс IntStack классе.");
    }
}
