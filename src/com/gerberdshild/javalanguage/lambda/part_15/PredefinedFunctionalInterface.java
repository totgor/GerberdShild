package com.gerberdshild.javalanguage.lambda.part_15;

// Импортировать предопределённый функциональный интерфейс.
import java.util.function.Function;


public class PredefinedFunctionalInterface {
    public static void main(String[] args) {
        // Блочное лямбда-выражение на основе предопределённого функционального интерфейса.
        // Вычисляет фатокрила целочисленного значения.
        // Использует функциональный интерфейс Fucntion<T, R> - выполняет операцию над объектом типа T и возвращает объект типа R. Содержит метод applay().
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Факториал числа 3 = " + factorial.apply(3));
        System.out.println("Факториал числа 5 = " + factorial.apply(5));
    }    
}
