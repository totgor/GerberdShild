package com.gerberdshild.javalanguage.generics.part_11.variant_1;

// Простая иерархия обобщеных классов.
class GenericSuper<T> {
    T object;

    GenericSuper(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }
}

// Подкласс, производный от обобщенного класса GenericSuper.
class Generic<T> extends GenericSuper<T> {
    Generic(T object) {
        super(object);
    }
}

//
public class GenericSuperClassDemo {
    public static void main(String[] args) {
        
    }
}
