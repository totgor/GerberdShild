package com.gerberdshild.javalanguage.generics.part_05;

//Класс статистики, вычисляющий среднее значение массива.
class Stats<T extends Number> {
    T[] nums;

    // Передаем констурктору ссылку на массив параметризированного типа.
    Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum;
    }

    boolean sameAvg(Stats<?> obj) {
        if (average() == obj.average())
            return true;
        return false;
    }
}

// Демонстрация применения метасимвола подстановки (метасимвольного аргумента).
public class WildCardDemo {
    public static void main(String[] args) {
        Integer[] inums = { 1, 2, 3, 4, 5 };        
        Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Float[] fnums = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };

        Stats<Integer> iobj = new Stats<Integer>(inums);        
        Stats<Double> dobj = new Stats<Double>(dnums);
        Stats<Float> fobj = new Stats<Float>(fnums);

        System.out.println("Среднее значение iobj = " + iobj.average());        
        System.out.println("Среднее значение dobj = " + dobj.average());
        System.out.println("Среднее значение fobj = " + fobj.average());
        System.out.println();
        
        System.out.print("Средние значения iobj и dobj ");
        if(iobj.sameAvg(dobj)) System.out.println("равны.");
        else System.out.println("не равны.");

        System.out.print("Средние значения iobj и fobj ");
        if(iobj.sameAvg(fobj)) System.out.println("равны.");
        else System.out.println("не равны.");
    }
}
