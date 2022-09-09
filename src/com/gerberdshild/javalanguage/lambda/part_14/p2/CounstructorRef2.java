package com.gerberdshild.javalanguage.lambda.part_14.p2;

// Пример применения ссылки на констурктор обобщенного класса.

// Обобщённый функциональный интерфейс.
interface MyFunction<T> {
    MyClass<T> function(T value);
}

class MyClass<T> {
    T value;

    MyClass() {
        value = null;
    }

    MyClass(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class CounstructorRef2 {
    public static void main(String[] args) {
        // Создать ссылку на обобщённый функциональный интерфейс MyFunction<T> и присвоить ей ссылку на конструктор обобщёного класса MyClass<T>.
        MyFunction<Integer> genericConstructorRef = MyClass<Integer>::new;
        // Создать экземпляр класса MyClass<T> по ссылке на констурктор.
        MyClass<Integer> obj = genericConstructorRef.function(100);
        System.out.println("Значение value объекта obj = " + obj.getValue());
    }
}
