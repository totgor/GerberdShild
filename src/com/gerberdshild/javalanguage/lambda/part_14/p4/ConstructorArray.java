package com.gerberdshild.javalanguage.lambda.part_14.p4;

//Пример использования ссылки на конструктор массива.

interface ArrayCreator<T> {
    T function(int value);
}

class MyClass {
    int value;

    MyClass() {
        value = 0;
    }

    MyClass(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}

public class ConstructorArray {
    public static void main(String[] args) {
        //тип[]::new
        
        // Создать ссылку на конструктор массива типа функционального интерфейса ArrayCreator.
        ArrayCreator<MyClass[]> arrayRef = MyClass[]::new;
        // Создать массив объектов MyClass, через ссылку на метод функционального интерфейса.
        MyClass[] array = arrayRef.function(5); //new MyClass[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = new MyClass(i);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i].getValue());            
        }
    }    
}
