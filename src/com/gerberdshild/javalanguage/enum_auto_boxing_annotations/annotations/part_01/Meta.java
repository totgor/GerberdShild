package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.annotations.part_01;

import java.lang.annotation.*;  //для объявления удержания аннотации
import java.lang.reflect.*;     //для поиска метода типа Method и последующего доступа к аннотациям

//Установка правила удержания аннотаций
@Retention(RetentionPolicy.RUNTIME)
//Объявление аннотации
@interface MyAnnotation {
    String str();

    int value();
}

//Пример простой аннотации. Получение аннотации во время выполнения с помощью рефлексии.
public class Meta {
    // Аннотировать метод
    @MyAnnotation(str = "Пример аннотации метода", value = 100)
    public static void myMethod() {
        Meta obj = new Meta();

        try {
            // 1. Получить объект типа Class, представляющий данный класс
            Class<?> c = obj.getClass();
            // Class<?> c = Meta.class; //Аналогичный способ написания

            // 2. Получить аннотированный метод объекта типа Class
            Method m = c.getMethod("myMethod");

            // 3. Получить аннотацию для найденного метода 
            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);

            // 4. Вывести значения членов аннотации
            System.out.println(annotation.str() + " " + annotation.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
