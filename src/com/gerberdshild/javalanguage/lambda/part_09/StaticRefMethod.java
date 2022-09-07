package com.gerberdshild.javalanguage.lambda.part_09;

// Пример использования статической ссылки на метод.

// Функциональный интерфейс для работы со строками.
interface StringFunction {
    String function(String str);
}

// Класс с методом, который совместимым с функциональным интерфейсом по сигнатуре.
class MyClass {
    // Метод меняющий порядок символов в строке.
    static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class StaticRefMethod {

    // Метод, который может получить ссылку на реализацию лямбда-выражения или 
    // ссылку на статический метод, который совместим по сигнатуре с функциональным интерфесом.
    static String stringOperation(StringFunction sf, String str) {
        return sf.function(str);
    }

    public static void main(String[] args) {
        String stringInput = "Лямбда-выражения повышают эффективность Java.";
        String stringOutput;
        // Ссылка на метод reverse() передаётся методу stringOperation().
        stringOutput = stringOperation(MyClass::reverse, stringInput);
        System.out.println("Изначальная строка stringInput: " + stringInput);
        System.out.println("Строка stringInput после инвертирования: " + stringOutput);

        // По идее можно не пользоваться функцией stringOperation() c лямбда-аргументом.
        StringFunction sf = MyClass::reverse; // На практике - это просто другой способ создания лямбда-выражения.
        System.out.println("Строка stringInput после инвертирования: " + sf.function(stringInput)); // Выводим инвертированную строку.
    }
}
