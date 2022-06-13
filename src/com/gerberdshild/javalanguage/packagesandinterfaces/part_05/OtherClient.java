package com.gerberdshild.javalanguage.packagesandinterfaces.part_05;

//Второй класс реализующий интерфейс Callback.
class OtherClient implements Callback {
    public void callback(int value) {
        System.out.println("Второй класс реализующий интерфейс Callback, value в квадрате = " + (value * value));
    }
}
