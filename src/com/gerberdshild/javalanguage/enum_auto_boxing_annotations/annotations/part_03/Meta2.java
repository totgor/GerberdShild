package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.annotations.part_03;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

// Пример рефлексии для вывода всех аннотаций элементов: класса и метода.
@What(description = "Annotation for class")
@MyAnno(str = "Meta2", value = 100)
public class Meta2 {

    @What(description = "Annotation for method")
    @MyAnno(str = "myMeth", value = 99)
    public static void myMeth(String str, int value) {
        try {
            Meta2 obj = new Meta2();
            // Получаем весь массив аннотаци для класса
            Annotation[] annotations_class = obj.getClass().getAnnotations();
            // Выводим все аннотации для класса
            for (Annotation a : annotations_class)
                System.out.println(a);

            Method m = obj.getClass().getMethod("myMeth", String.class, int.class);
            Annotation[] annotations_method = m.getAnnotations();
            for (Annotation a : annotations_method)
                System.out.println(a);
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found.");
        }
    }

    public static void main(String[] args) {
        myMeth("Test string", 200);
    }
}
