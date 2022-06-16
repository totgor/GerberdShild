package com.gerberdshild.javalanguage.packagesandinterfaces.part_06;

public class Client extends Incomplete{
    public void callback(int value) {
        System.out.println("Реализация метода callback в классе Client, который наследует абстрактный класс Incomplete. Incomplete в свою очередь включает интерфейс Callback, но не имеет реализацию. value = " + value);
    }
}
