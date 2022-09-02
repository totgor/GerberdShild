package com.gerberdshild.javalanguage.lambda.part_03;

// Пример лямбда-выражения с двумя параметрами.
interface NumericTest {
    boolean test(int n, int d);
}

public class LambdaExpressionWithTwoParameters {
   public static void main(String[] args) {
    // Является ли одно число делителем другого.
        NumericTest numericTest = (n, d) -> (n % d) == 0;

        if (numericTest.test(10, 2))
            System.out.println("Число 2 является делителем 10.");
        if (!numericTest.test(10, 3))
            System.out.println("Число 3 не является делителем 10.");

        //Если явно указывается тип одного параметра, то тип другого параметра тоже слудет указать.
        numericTest = (int n, int d) -> (n > d);
        if (numericTest.test(10, 9)) System.out.println("10 больше 9");
   }
}
