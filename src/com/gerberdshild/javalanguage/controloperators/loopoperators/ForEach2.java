package com.gerberdshild.javalanguage.controloperators.loopoperators;

//Применение оператора break в цикле for в стиле for each.
public class ForEach2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int x : nums) {
            System.out.println("Знаечние х = " + x);
            sum += x;
            if (x == 5) break; //прервать цикл после получения первых 5 значений
        }
        System.out.println("Сумма первых 5 значений = " + sum);

    }
}
