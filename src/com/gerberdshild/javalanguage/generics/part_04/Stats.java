package com.gerberdshild.javalanguage.generics.part_04;

//Пример использования ограниченного типа в обобщенном классе.
//Тип T должен быть или наследоваться от класса Number.
public class Stats<T extends Number> {
    T[] nums;

    //Передаем конструктору ссылку на массив элементов класса Number или его подкласса.
    Stats(T[] nums) {
        this.nums = nums;
    }

    //возвратить значение типа double.
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i].doubleValue();
        }
        return sum / nums.length;
    }    
}


