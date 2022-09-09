package com.gerberdshild.javalanguage.lambda.part_13;

// Использовать ссылку на метод, чтобы найти максимальное значение в коллекции.
import java.util.*;

class MyClass {
    private int value;

    MyClass(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}

public class MethodRef {

    // Этот метод совместим с методом compare(), определённым в интерфейсе Comparator<T>.
    static int compareMyClass(MyClass a, MyClass b) {
        return a.getValue() - b.getValue();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> arrayList = new ArrayList<MyClass>();
        arrayList.add(new MyClass(1));
        arrayList.add(new MyClass(4));
        arrayList.add(new MyClass(6));
        arrayList.add(new MyClass(9));
        arrayList.add(new MyClass(5));
        arrayList.add(new MyClass(7));
        arrayList.add(new MyClass(1));
        arrayList.add(new MyClass(2));

        // Находим максимальное значение в arrayList, используя метод compareMyClass().
        MyClass maxValueMyClassInArrayList = Collections.max(arrayList, MethodRef::compareMyClass);
        System.out.println("Максимальное значение value среди объектов MyClass в arrayList: " + maxValueMyClassInArrayList.getValue());

    }    
}
