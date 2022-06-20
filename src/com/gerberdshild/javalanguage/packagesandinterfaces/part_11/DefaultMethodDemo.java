package com.gerberdshild.javalanguage.packagesandinterfaces.part_11;

//Пример использования метода по умолчанию в интерфейсе.
public class DefaultMethodDemo {
    public static void main(String[] args) {
        ImplementsInterface1 obj1 = new ImplementsInterface1();
        ImplementsInterface2 obj2 = new ImplementsInterface2();

        System.out.println("Вывод методов getNumber() и getString() класса ImplementsInterface1:");
        System.out.println(obj1.getNumber());
        System.out.println(obj1.getString());

        System.out.println("Вывод методов getNumber() и getString()  класса ImplementsInterface2:");
        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());
    }
}
