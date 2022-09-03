package com.gerberdshild.javalanguage.lambda.part_04;

// Пример блочного лямбда выражения, вычисляющего факториал числа n.
// Функциональный интерфейс.
interface Numeric {
    int function(int value);
}

public class LambdaBlock {
    public static void main(String[] args) {
        // Это блочное лямбда-выражение вычисляет факториал целочисленного значения.
        Numeric factorial = (n) -> {
          int result = 1;
          
          for (int i = 2; i <= n; i++) {
            result = result * i;
          }

          return result;
        };

        System.out.println("Факториал числа 3 равен: " + factorial.function(3));
        System.out.println("Факториал числа 7 равен: " + factorial.function(5));
    }
}
