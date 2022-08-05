package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.annotations.part_05;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MarkerMethod {
}

@Retention(RetentionPolicy.RUNTIME)
@interface MarkerClass {
}

// Пример маркерной аннотации.
@MarkerClass
public class Meta4 {

    @MarkerMethod
    public static void myMeth() {
        try {
            Meta4 obj = new Meta4();

            Class<?> c = obj.getClass();
            if (c.isAnnotationPresent(MarkerClass.class))
                System.out.println("У класса Meta4 присутствует маркерная аннотация @MarkerClass.");

            Method m = obj.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MarkerMethod.class))
                System.out.println("У метода myMeth() присутствует маркерная аннотация @MarkerMethod.");
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
