package com.gerberdshild.javalanguage.generics.part_04;

// Применение класса Stats - обобщенный класс с ограниченным типом.
public class Bounds {
    public static void main(String[] args) {
        Integer[] inums = { 1, 2, 3, 4, 5 };
        Stats<Integer> iobj = new Stats<Integer>(inums);
        System.out.println("Среднее значение массива inums[] = " + iobj.average());

        Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dobj = new Stats<Double>(dnums);
        System.out.println("Среднее значение массива dnums[] = " + dobj.average());

        // Компилятор покажет ошибку, String не является подклассом или классом Number.
        // String[] snums = {"1", "2", "3", "4", "5"};
        // Stats<String> sobj = new Stats<String>(snums);
        // System.out.println("Среднее значение массиива snums[] = " + sobj.average());
    }
}
