package com.gerberdshild.javalanguage.exception_handling.part_06;

//Применение нескольких операторов catches.
public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 7 / a;
            int[] c = {1};
            c[23] = 7;
        } catch(ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы индексации массива: " + e);
        }
        System.out.println("Оператор следующий за операторами try/catch.");
    }
}
