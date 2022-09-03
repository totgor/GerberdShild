package com.gerberdshild.javalanguage.lambda.part_06;

// Пример передачи лямбда-выражений в качестве аргумента.

// Функциональный интерфейс.
interface StringFunction {
    String function(String str);
}

public class LambdasAsArgument {

    // Метод которому передается лямбда-выражение в качестве параметра и строка для манипуляций.
    public static String StringOperation(StringFunction stringFunction, String str) {
        // Метод возвращает результат действия лямбда-выражения.
        return stringFunction.function(str);
    }

    public static void main(String[] args) {
        String inputStr = "Лямбда-выражения повышают эффективность Java.";
        String outputStr;

        System.out.println("Исходная строка inputStr: " + inputStr);

        // 1. Передаем в качестве аргумента одиночное лямбда-выражение.
        outputStr = StringOperation((str) -> str.toUpperCase(), inputStr);
        System.out.println("Теперь строка inputStr с прописными буквами: " + outputStr);

        // 2. Передаем в качестве аргумента блочное лямбда-выражение.
        outputStr = StringOperation((str) -> {
            String result = "";
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            }
            return result;
        }, inputStr);
        System.out.println("Теперь строка inputStr c удалёнными пробелами: " + outputStr);

        // 3. Передаем в качестве аргумента ссылку на лямбда выражение.
        StringFunction stringFunction = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        outputStr = StringOperation(stringFunction, inputStr);
        System.out.println("Теперь строка inputStr c изменённым порядком символов: " + outputStr);

    }
}
