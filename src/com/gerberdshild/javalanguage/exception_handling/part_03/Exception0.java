package com.gerberdshild.javalanguage.exception_handling.part_03;

//Применение блоков операторов try и catch.
public class Exception0 {
    public static void main(String[] args) {
        int a, d;
        try {
            d = 0;
            a = 7 / d;
            System.out.println("Эта строка не будет выведена, т.к. до нее произойдет деление на ноль.");
        } catch (ArithmeticException e) {
            //Перехватить деление на ноль.
            System.out.println("Деление на ноль.");
        }
        System.out.println("Строка кода после catch.");
    }
}
