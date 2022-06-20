package com.gerberdshild.javalanguage.packagesandinterfaces.part_11;

public interface InterfaceWithDefaultMethod {
    //Это объявление обычного метод в интерфейсе.
    int getNumber();

    //Это объявление метода с реализацией по умолчанию в интерфейсе.
    default String getString() {
        return "Эта строка возвращается методом по умолчанию, принадлежащим интерфейсу.\n";
    }
}
