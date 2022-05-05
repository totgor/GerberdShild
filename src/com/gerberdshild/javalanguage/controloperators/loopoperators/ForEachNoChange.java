package com.gerberdshild.javalanguage.controloperators.loopoperators;

//Итерационная переменная в стиле for each доступна только для чтения.
public class ForEachNoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : nums) {
            System.out.print(x + " ");
            sum += x;
            x = x * 10; //Этот оператор не оказывает воздействия на x
        }
        System.out.println();
        System.out.println("Сумма элементов массива = " + sum);
        System.out.println();

        sum = 0;
        for (int x : nums) {
            System.out.print(x + " ");
            sum += x;
        }
        System.out.println();
        System.out.println("Сумма элементов массива = " + sum);
    }
}
