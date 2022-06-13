package com.gerberdshild.javalanguage.packagesandinterfaces.part_05;

//Первый класс реализующий интерфейс Callback.
class Client implements Callback {
    public void callback(int value) {
        System.out.println("Первый класс реализующий интерфейс Callback, value = " + value);
    }

    void noInterfaceMethod() {
        System.out.println("Метод класса Client.");
    }
}
