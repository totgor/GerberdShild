package com.gerberdshild.javalanguage.lambda.part_04;

// Пример блочного лямбда-выражения, которое изменяет порядок символов в строке.
interface StringFunction {
    String function(String str);
}

public class LambdaBlock2 {
    public static void main(String[] args) {
        // Блочное лямбда-выражение изменяет порядок символов в строке.
        StringFunction reverse = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println("Обратный порядок строки \"Привет, Москва!\" будет:  " + reverse.function("Привет, Москва!"));
        System.out.println("Обратный порядок строки \"Здравствуй, Мир!\" будет:  " + reverse.function("Здравствуй, Мир!"));
    }
}
