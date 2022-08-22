package com.gerberdshild.javalanguage.generics.part_04;

//Класс StatsError - обощенный класс для вычисленяи среднего значения массива чисел заданного типа.
//Класс содержит ошибку
public class StatsError <T>{
    T[] nums;

    StatsError(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            //Ошибка, метод досутпен только в классах оболочек числовых типов. Тут T - не обязательно числовой тип.
            //sum = sum + nums[i].doubleValue(); 
        }
        return sum / nums.length;
    }    
}
