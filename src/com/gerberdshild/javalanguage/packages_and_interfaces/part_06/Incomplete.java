package com.gerberdshild.javalanguage.packages_and_interfaces.part_06;

//Пример объявления класса, который не полностью реализует интерфейс. Для этого класс должен быть объявлен абстрактным.
abstract public class Incomplete implements Callback {
    int a, b;

    void show(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    //в абстрактном классе отсутствет реализация метода
    //public void callback(int value) {}

}
