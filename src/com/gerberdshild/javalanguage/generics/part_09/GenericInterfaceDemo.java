package com.gerberdshild.javalanguage.generics.part_09;

//Пример использования обобщенного интерфейса.

//Обобщённый интерфейс дял определения минимального максимального значения.
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// Реализация обобщенного интерфейса.
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] array;

    MyClass(T[] array) {
        this.array = array;
    }

    // Возвратить минимальное значение из массива array.
    public T min() {
        T result = array[0];
        for (int i = 1; i < array.length; i++) 
            if(array[i].compareTo(result) < 0) result = array[i];
        return result;
    }

    // Возвратить максимальное значение из массива array.
    public T max() {
        T result = array[0];
        for (int i = 1; i < array.length; i++) 
            if(array[i].compareTo(result) > 0) result = array[i];
        return result;
    }    
}


public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Integer[] int_array = {1, 2, 3, 4, 5};
        Character[] char_array = {'f', 'h', 'v', 'g'};

        MyClass<Integer> int_obj = new MyClass<Integer>(int_array);
        MyClass<Character> char_obj = new MyClass<Character>(char_array);

        System.out.println("Минимальное значение int_obj: " + int_obj.min());
        System.out.println("Максимальное значение int_obj: " + int_obj.max());
        
        System.out.println("Минимальное значение char_obj: " + char_obj.min());
        System.out.println("Максимальное значение char_obj: " + char_obj.max());

    }
}
