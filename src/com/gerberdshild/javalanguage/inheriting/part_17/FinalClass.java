package com.gerberdshild.javalanguage.inheriting.part_17;

//Пример использования модификатора доступа final для класса, запрещающего наследование.
final class A {
    void method() {
        System.out.println("Это конечный класс, его наследование запрещено.");
    }
}

//class B extends A {
//    void method() {
//        System.out.println("Ошибка! Наследование класса A запрещено.");
//    }
//}

public class FinalClass {
    public static void main(String[] args) {
        A a = new A();
        a.method();
    }
}
