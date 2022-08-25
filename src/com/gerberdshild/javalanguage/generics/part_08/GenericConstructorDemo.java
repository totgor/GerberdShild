package com.gerberdshild.javalanguage.generics.part_08;

// Пример обобщенного конструктора.
class GenericConstructor {
    double value;

    <T extends Number> GenericConstructor(T value) {
        this.value = value.doubleValue();
    }

    void showValue() {
        System.out.println("Value = " + value);
    }
}

public class GenericConstructorDemo {
    public static void main(String[] args) {
        GenericConstructor test1 = new GenericConstructor(100);
        GenericConstructor test2 = new GenericConstructor(123.4F);
        test1.showValue();
        test2.showValue();
    }
}
