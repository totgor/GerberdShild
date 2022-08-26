package com.gerberdshild.javalanguage.generics.part_11.variant_2;

// Иерархия обобщенных классов, где подкласс имеет свой параметр типа.

class GenericSuper<T> {
    T object;

    GenericSuper(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }
}

// Два параметра типа: T для суперкласса GenericSuper, V для подкласса Generic.
class Generic<T, V> extends GenericSuper<T> {
    V other_object;

    Generic(T object, V other_object) {
        super(object);
        this.other_object = other_object;
    }

    V getOtherObject() {
        return other_object;
    }
}

public class GenericSuperClassDemo {
    public static void main(String[] args) {
        // Создаем объект Generic для String и Integer.
        Generic<String, Integer> generic = new Generic<String, Integer>("Значенние object = ", 777);
        System.out.println(generic.getObject() + " " + generic.getOtherObject());
    }
}
