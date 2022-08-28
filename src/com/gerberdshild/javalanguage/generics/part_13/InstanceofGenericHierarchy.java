package com.gerberdshild.javalanguage.generics.part_13;

// Применение оператора instanceof в иерархии обобщенных классов.
class Generic<T> {
    T object;

    Generic(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }
}

class SubGeneric<T> extends Generic<T> {
    SubGeneric(T object) {
        super(object);
    }
}

public class InstanceofGenericHierarchy {
    public static void main(String[] args) {
        Generic<Integer> int_gen = new Generic<Integer>(777);
        SubGeneric<Integer> int_subgen = new SubGeneric<Integer>(555);
        SubGeneric<String> str_subgen = new SubGeneric<String>("Тест обобщения.");

        if (int_subgen instanceof Generic<?>) System.out.println("int_subgen является объектом класса Generic или его потомком."); //выведет
        if (int_subgen instanceof SubGeneric<?>) System.out.println("int_subgen является объектом класса SubGeneric."); //выведет
        System.out.println();

        if (str_subgen instanceof Generic<?>) System.out.println("str_subgen является объектом класса Generic или его потомком."); //выведет
        if (str_subgen instanceof SubGeneric<?>) System.out.println("str_subgen является объектом класса SubGeneric."); //выведет
        System.out.println();

        if (int_gen instanceof Generic<?>) System.out.println("int_gen является объектом класса Generic."); //выведет
        if (int_gen instanceof SubGeneric<?>) System.out.println("int_subgen является объектом класса SubGeneric."); //не выведет
        System.out.println();
        
        //Следующий код не скомпилируется, т.к. сведения об обобщенном типе отсутствуют во время выполнения. Хммм??? у меня скомпилировался и вывел результат.
        if(int_subgen instanceof SubGeneric<Integer>) System.out.println("int_subgen является объектом класса SubGeneric<Integer>.");
        System.out.println();

        // Приведение типов
        System.out.println("До приведения типов int_get.object = " + int_gen.getObject());
        int_gen = (Generic<Integer>) int_subgen; //такое приведение типов допустимо, т.к. int_subgen является экземпляром типа Generic<Integer>.
        System.out.println("int_gen.object = " + int_gen.getObject());

        //int_gen = (Generic<Long>) int_subgen; //такое приведение типов не допустимо, т.к. int_subgen неявляется экземпляром типа Generic<Long>.
    }
}
