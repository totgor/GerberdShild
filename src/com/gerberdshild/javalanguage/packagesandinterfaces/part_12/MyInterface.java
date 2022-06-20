package com.gerberdshild.javalanguage.packagesandinterfaces.part_12;

//Пример объявления статического метода в интерфейсе.
public interface MyInterface {
    //стандартный метод, который надо реализовать
    int getNumber();

    //метод по умолчанию
    default String getString() {
        return "Строка из метода по умолчанию.";
    }

    //статический метод, никем не наследуется, но всегда доступен через имя интерфейса
    static int getDefaultNumber() {
        return 0;
    }
}
