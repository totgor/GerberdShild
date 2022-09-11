package com.gerberdshild.javalanguage.lambda.part_14.p3;

// Пример реализации простой фабрики классов, используя ссылки на конструкторы.

// Обобщённый функциональный интерфес, для ссылки на констуркторы различных классов.
interface MyFunction<R, T> {
    R function(T value);
}

class MyClass1<T> {
    T value;

    MyClass1() {
        value = null;
    }

    MyClass1(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

class MyClass2 {
    String str;

    MyClass2() {
        str = null;
    }

    MyClass2(String str) {
        this.str = str;
    }

    String getStr() {
        return str;
    }
}

public class ClassFactory {
    // Фабричный метод для создания объектов разных классов.
    //У каждого класса два параметра:
    //R - сам создаваемый класс
    //T - тип передаваемого параметра.
    static <R, T> R classFactory(MyFunction<R, T> refConstructorObject, T value) {
        return refConstructorObject.function(value);
    }
    
    public static void main(String[] args) {
        // Создать ссылку на констурктор класса MyClass1.
        MyFunction<MyClass1<Integer>, Integer> refMyClass1 = MyClass1<Integer>::new;
        // Создать экземпляр объекта MyClass1 используя фабричный метод.
        MyClass1<Integer> obj1 = classFactory(refMyClass1, 100);
        System.out.println("Значение value в объекте obj1 = " + obj1.getValue());

        MyFunction<MyClass2, String> refMyClass2 = MyClass2::new;
        MyClass2 obj2 = classFactory(refMyClass2, "Лямбда-выражение.");
        System.out.println("Значение str в объекте obj2 = " + obj2.getStr());

        // Если сократить запись.
        MyClass1<Double> obj3 = classFactory(MyClass1::new, 100.12);
        System.out.println("Значение value в объекте obj = " + obj3.getValue());

        MyClass2 obj4 = classFactory(MyClass2::new, "Лямбда-выражение 2.");
        System.out.println("Значение str в объекте obj2 = " + obj4.getStr());

    }
}
