package com.gerberdshild.javalanguage.lambda.part_07;

// Пример генерации исключения из лямбда-выражения.

// Функциональный интерфейс.
interface AverageArray {
    double function(double[] array) throws EmptyArrayException;
}

// Объявляем своё проверяемое исключение, наследуясь от Exception.
class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Пустой массив.");
    }
}

public class LambdaException {
    public static void main(String[] args) throws EmptyArrayException{
        double[] double_array = {1.0, 2.0, 3.0, 4.0, 5.0};

        // Лямбда-выражение, которое может сгенерировать исключение, если массив пуст.
        AverageArray averageArray = (array) -> {
            double sum = 0;

            if(array.length == 0) throw new EmptyArrayException();

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            return sum / array.length;
        };

        System.out.println("Среднее значения массива double_array = " + averageArray.function(double_array));

        System.out.println("Среднее значение пустого массива, который сгенерирует исключение: " + averageArray.function(new double[0]));
    }    
}
