package com.gerberdshild.javalanguage.lambda.part_14;

// Пример применения ссылки на конструктор.

// Функциональный интерфейс с методом возвращающим ссылку на класс MyClass.
interface MyFunction {
    MyClass function(int value);
}

class MyClass {
    private int value;

    MyClass() {
        value = 0;
    }

    MyClass(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}

public class ConstructorRef {
    public static void main(String[] args) {
        // Создать ссылку (типа функционального интерфейса) типа Myfunction, которая ссылается на конструктор класса MyClass, причем тот констурктор который с параметром. 
        // Т.к. только этот конструктор соответсвует методу в функциональном интерфейсе.
        MyFunction constructorRef = MyClass::new;
        // Создать экземпляр класса MyClass по ссылке на его конструктор.
        MyClass obj = constructorRef.function(100);
        System.out.println("Значение value объекта obj = " + obj.getValue());
    }
}
