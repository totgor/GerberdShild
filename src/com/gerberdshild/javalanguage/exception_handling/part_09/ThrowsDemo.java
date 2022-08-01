package com.gerberdshild.javalanguage.exception_handling.part_09;

//Пример использования оператора throws.
//Для методов не обрабатывающих свои исключения, но генерирующие их.
//Кроме исключений относящихся к классам Error и RuntimeException, их подклассам.

//Этот код не скомпилируется
//public class ThrowsDemo {
//    static void throwOne() {
//        System.out.println("В теле метода throwOne().");
//        throw new IllegalAccessException("Генерируем исключение.");
//    }
//
//    public static void main(String[] args) {
//        throwOne();
//    }
//}
