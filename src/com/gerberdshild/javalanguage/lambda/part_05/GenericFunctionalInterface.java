package com.gerberdshild.javalanguage.lambda.part_05;

// Пример обобщенного функционального интерфейса с разнотипными лямбда выражениями.

// Обобщенный функциональный интерфейс.
interface SomeFunction<T> {
    T function(T value);
}

public class GenericFunctionalInterface {
    public static void main(String[] args) {
        
        // Использовать целочисленный вариант функционального интерфейса.
        SomeFunction<Integer> factorial = (n) -> {
            int result = 1;

            for(int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Факториал числа 3 равен: " + factorial.function(3));
        System.out.println("Факториал числа 5 равен: " + factorial.function(5));

        // Использовать строковый вариант функционального интерфейса.
        SomeFunction<String> reverse = (str) -> {
            String result = "";

            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Обратный порядок строки \"Привет, Москва!\" будет:  " + reverse.function("Привет, Москва!"));
        System.out.println("Обратный порядок строки \"Здравствуй, Мир!\" будет:  " + reverse.function("Здравствуй, Мир!"));
    }
}
