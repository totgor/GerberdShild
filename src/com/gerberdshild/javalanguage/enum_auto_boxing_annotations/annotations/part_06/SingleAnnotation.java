package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.annotations.part_06;

import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
// Одночленная аннотация value()
@interface MySingle {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
// Одночленная аннотация value() + default метод
@interface MySingleDefault {
    int value();

    int xyz() default 0;
}

// Пример одночленной аннотации.
@MySingleDefault(200)
public class SingleAnnotation {

    @MySingle("Одночленная аннотация")
    public static void myMeth() {
        try {
            SingleAnnotation obj = new SingleAnnotation();
            MySingleDefault anno1 = obj.getClass().getAnnotation(MySingleDefault.class);
            System.out.println(anno1.value() + " " + anno1.xyz());

            Method m = obj.getClass().getMethod("myMeth");
            MySingle anno2 = m.getAnnotation(MySingle.class);
            System.out.println(anno2.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
