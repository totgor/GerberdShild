package com.gerberdshild.javalanguage.generics.part_14;

// Переопределение методов в обобщенном классе.
class Generic<T> {
    T object;

    Generic(T object) {
        this.object = object;
    }

    T getObject() {
        System.out.println("getObject() из класса Generic: ");
        return object;
    }
}

class SubGeneric<T> extends Generic<T> {
    SubGeneric(T object) {
        super(object);
    }

    //переопределение метода
    T getObject() {
        System.out.println("getObject() из класса SubGeneric: ");
        return object;
    }
}

public class OverrideMethodGeneric {
    public static void main(String[] args) {
        Generic<Integer> int_gen = new Generic<Integer>(77);
        SubGeneric<Integer> int_subgen = new SubGeneric<Integer>(88);
        SubGeneric<String> str_subgen = new SubGeneric<String>("Тест обобщения.");
        System.out.println(int_gen.getObject());
        System.out.println(int_subgen.getObject());
        System.out.println(str_subgen.getObject());
    }    
}
