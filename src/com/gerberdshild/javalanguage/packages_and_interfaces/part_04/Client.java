package com.gerberdshild.javalanguage.packages_and_interfaces.part_04;

//Класс реализующий интерфейс
class Client implements Callback {
    public void callback(int value) {
        System.out.println("Это реализация метода callback() из интерфейса Callback со значением value: " + value);
    }

    void noInterfaceMethod() {
        System.out.println("Класс реализующий интерфейс может иметь свои поля и методы. Это метод класса.");
    }
}
