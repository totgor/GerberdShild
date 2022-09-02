package com.gerberdshild.javalanguage.lambda.part_02;

// Применение лямбда-выражения принимающего один параметр.
interface NumericTest {
    boolean test(int n);
}

public class LambdaExpressionWithParameter {
    public static void main(String[] args) {
        NumericTest numericTest = (n) -> (n % 2) == 0;

        if (numericTest.test(10))
            System.out.println("10 чётное число.");
        if (!numericTest.test(9))
            System.out.println("9 нечётное число.");

        numericTest = (k) -> k >= 0;
        if (numericTest.test(1))
            System.out.println("1 положительное число.");
        if (!numericTest.test(-1))
            System.out.println("-1 отрицательное число.");

        // Тип параметра указывать не обязательно, но указав он должен быть совместим с
        // типом в функциональном интерфейсе.
        numericTest = (int k) -> k > 100;
        if (numericTest.test(1000))
            System.out.println("1000 больше 100.");

        // Если в лямбда-выражении параметр один, то скобки указывать не обязательно.
        numericTest = k -> k < 100;
        if (numericTest.test(99))
            System.out.println("99 меньше 100.");

    }
}
