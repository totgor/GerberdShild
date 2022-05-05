package com.gerberdshild.javalanguage.controloperators.loopoperators;

//Применение цикла for в стиле for each для обращения к двухмерному массиву.
public class ForEachTwoArray {
    public static void main(String[] args) {
        int[][] nums = new int[3][5];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        //for each для вычисления суммы и вывода значений
        for (int[] x : nums) {
            for (int y : x) {
                System.out.print(" " + y);
                sum += y;
            }
            System.out.println();
        }
        System.out.println("Сумма значений элементов двухмерного массива = " + sum);
    }
}
