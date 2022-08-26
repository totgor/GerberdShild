package com.gerberdshild.javalanguage.generics.part_12;

// Пример применения обобщённого подкласса.

//Необобщенный суперкласс
class NonGeneric {
    private int num;

    NonGeneric(int num) {
        this.num = num;
    }

    int getNumber() {
        return num;
    }
}

// Обобщенный подкласс.
class Generic<T> extends NonGeneric {
    private T object;

    Generic(int num, T object) {
        super(num);
        this.object = object;
    }

    T getObject() {
        return object;
    }
} 

public class GenericSubclassDemo {
    public static void main(String[] args) {
        Generic<String> obj = new Generic<String>(777, "Это строка для обобщенного подкласса.");
        System.out.println(obj.getObject() + " Это num из супер класса = " + obj.getNumber());
    }    
}
