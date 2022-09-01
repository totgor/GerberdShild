package com.gerberdshild.javalanguage.generics.part_17;

// Ограничения на обобщения и массивы.
class Generic<T extends Number> {
    T obj;
    T[] array;

    Generic(T obj, T[] array) {
        this.obj = obj;
        this.array = array;
        //array = new T[10]; //Нельзя создать массив объектов T.
    }
}

public class GenericArrays {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 4, 5};

        Generic<Integer> obj1 = new Generic<Integer>(100, num);

        // Нельзя создать массив конкретного типа обобщенных ссылок.
        // Generic<Integer>[] obj2 = new Generic<Integer>[10];
        
        // Но миожно создать массив обобщенного типа(метасимвол) обобщенных ссылок.
        Generic<?>[] obj3 = new Generic<?>[10];
    }    
}
