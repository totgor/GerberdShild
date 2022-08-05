package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.annotations.part_04;

//Использование значений по умолчанию для элементов аннотации.
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "Тестирование";

    int value() default 9000;
}

// Аннотирование по умолчанию
@MyAnno()
public class Meta3 {
    // Частичное аннотирование
    @MyAnno(str = "Аннотирование метода")
    public static void myMeth() {
        try {
            Meta3 obj = new Meta3();

            Class<?> c = obj.getClass();
            MyAnno anno_class = c.getAnnotation(MyAnno.class);
            System.out.println("Вызов значения полей аннотации для класса (тут они по умолчанию):");
            System.out.println(anno_class.str() + " " + anno_class.value());

            Method m = c.getMethod("myMeth");
            MyAnno anno_method = m.getAnnotation(MyAnno.class);
            System.out.println("Вызов значения полей аннотации для метода (тут частично аннотирвание по умолчанию для value()):");
            System.out.println(anno_method.str() + " " + anno_method.value());

        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
