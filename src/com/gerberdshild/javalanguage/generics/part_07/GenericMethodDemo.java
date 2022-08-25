package com.gerberdshild.javalanguage.generics.part_07;

// Пример простого обощенного метода.
public class GenericMethodDemo {
    //Определить, содержится ли объект в массиве.
    //Т ограничен сверху интерфесом Comparable. Интерфейс обобщенный. T - может принимать объекты, которые можно упорядочивать.
    static <T extends Comparable<T>, V extends T> // Тут по идее второй параметр не нужен! Можно справиться одним параметром типа T.
    boolean isIn(T element, V[] array) {        // Достаточно тут объявить T[] вместо V[] (работает!).
        for (int i = 0; i < array.length; i++)
            if(element.equals(array[i])) return true;        
        return false;
    }

    public static void main(String[] args) {
        Integer[] int_array = {1, 2, 3, 4, 5};
        String[] string_array = {"один", "два", "три", "четыре", "пять"};

        if(isIn(3, int_array)) System.out.println("3 является элементом массива int_array.");
        if(!isIn(7, int_array)) System.out.println("7 не является элементом массива int_array.");

        //Достучаться до метода isIn можно и указав аругменты типов.
        if(GenericMethodDemo.<Integer, Integer>isIn(5, int_array)) System.out.println("5 является элементом массива int_array.");

        if(isIn("четыре", string_array)) System.out.println("\"четыре\" является элементом массива string_array.");
        if(isIn("семь", string_array)) System.out.println("\"семь\" не является элементом массива string_array.");

        //if(isIn(5, string_array)) System.out.println("Не соответствие типов"); //Ошибка! Типы должны быть совместимы.
    }    
}
