package com.gerberdshild.javalanguage.data_types_variables_arrays.array;

//Среднее значение в масииве.
public class AverageInArray {
    public static void main(String[] args) {
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (int i = 0; i < 5; i++) {
            result = result + nums[i];
        }
        System.out.println("Среднее значение = " + (result/5));
    }
}
