package com.gerberdshild.javalanguage.exception_handling.part_09;

//Пример использования оператора throws.
//Для методов не обрабатывающих свои исключения, но генерирующие их.
//Кроме исключений относящихся к классам Error и RuntimeException, их подклассам.
public class ThrowsDemo2 {
    //сообщаем через throws, что метод может генерировать перечисленное исключение, но сам его не обрабатывает
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne.");
        throw new IllegalAccessException("Генерируем исключение.");
    }

    public static void main(String[] args) {
        //при использовании подобного метода, необходимо обработать его исключение
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Исключение перехвачено в main(): " + e);
        }

    }
}
