package com.gerberdshild.javalanguage.inheriting.part_16;

//Пример использования модификатора доступа final перед методом, запрещающим переопределение.
class A {
    final void method() {
        System.out.println("Этот метод нельзя переопределить.");
    }
}

class B extends A {
//    void method() {
//        System.out.println("Ошибка. Метод нельзя переопределить.");
//    }
}
public class FinalMethod {
    public static void main(String[] args) {
        B b = new B();
        b.method();
    }
}
