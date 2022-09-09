package com.gerberdshild.javalanguage.lambda.part_12;

// Применение ссылки на обобщенный метод.

// Функциональный интерфес для обработки массива и возврата целочисленнго значения.
interface MyFunction<T> {
    int function(T[] array, T value);
}

class MyClass {
    // Обобщённый метод, в необобщенном классе, по сигантуре совместим с функциональным интерфейсом.
    // Возвращает колличество элементов в массиве.
    static <T> int macthCounter(T[] array, T value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                count++;
        }
        return count;
    }
}

public class GenericMethodRef {
    
    // Обобщённый метод в который передаётся ссылка на функциональный инетфейс, массив и элемент для поиска и подсчёта.
    static <T> int myOperation(MyFunction<T> myFunctionRef, T[] array, T value) {
        return myFunctionRef.function(array, value);
    }
    public static void main(String[] args) {
        Integer[] int_array = {1, 2, 3, 4, 5, 4, 4, 6, 8, 2};
        String[] str_array = {"один", "два", "три", "два", "два", "пять"};

        // В качестве ссылки на функицональный интерфейс передаём ссылку на обобщенный метод.
        int count = myOperation(MyClass::<Integer>macthCounter, int_array, 4);
        System.out.println("Цифра 4 встречается в массиве " + count + " раза.");

        count = myOperation(MyClass::<String>macthCounter, str_array, "два");
        System.out.println("Строка \"два\" встречается в массиве " + count + " раза.");
    }

}
