package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.annotations.part_02;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)

@interface MyAnnotation {
    String str();

    int value();
}

//Пример рефлексии для вывода полей аннотации, описывающей метод с параметрами.
public class Meta {
    @MyAnnotation(str = "Два параметра", value = 100)
    public static void myMethod(String str, int value) {
        System.out.println("Параметры переданные в метод:");
        System.out.println("str = " + str + " value = " + value);

        Meta obj = new Meta();

        try {
            Class<?> c = obj.getClass();
            
            //Указываем типы параметров метода
            Method m = c.getMethod("myMethod", String.class, int.class);

            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);

            System.out.println("Значения полей аннотированного метода:");

            System.out.println(annotation.str() + " " + annotation.value());

        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMethod("Тест", 777);
    }

}
