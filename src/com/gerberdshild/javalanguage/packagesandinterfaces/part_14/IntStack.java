package com.gerberdshild.javalanguage.packagesandinterfaces.part_14;

public interface IntStack {

    void push(int value);

    int pop();

    //Добавляя default-метод, не нарушаентся старый код. Т.к. реализация не обязательна, а для использования достаточно переопределение default-метода.
    default void clear() {
        System.out.println("Метод clear() следует переопределить в реализующем интерфейс IntStack классе.");
    }
}
