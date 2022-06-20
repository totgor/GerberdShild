package com.gerberdshild.javalanguage.packagesandinterfaces.part_11;

public class ImplementsInterface2 implements InterfaceWithDefaultMethod {
    //В классе обязательно должен быть реализован только этот метод.
    @Override
    public int getNumber() {
        return 200;
    }

    //Это переопределение метода по умолчанию в интерфейсе на свой метод в классе.
    @Override
    public String getString() {
        return "Это строка возвращается переопределающим \"default метод\" методом, принадлежащим классу ImplementsInterface2.";
    }
}
