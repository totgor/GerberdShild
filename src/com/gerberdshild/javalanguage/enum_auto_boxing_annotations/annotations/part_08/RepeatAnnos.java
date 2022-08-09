package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.annotations.part_08;

//Пример повторяющейся аннотации.
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
//Сделать аннотацию @MyAnno повторяющейся, указав в аннотации @Repeatable типа контейнера для массива повторяющейся аннотации MyAnno
@Repeatable(ContainerMyAnno.class)
@interface MyAnno {
    String str() default "Тетсирование";
    int val() default 9000;
}

//Это контейнерная аннотация @ContainerMyAnno
@Retention(RetentionPolicy.RUNTIME)
@interface ContainerMyAnno {
    MyAnno[] value(); //указывается лишь один параметр value, тип которого массив повторяющейся аннотации @MyAnno
}

public class RepeatAnnos {

    @MyAnno(str = "Первая аннотация", val = 100)
    @MyAnno(str = "Вторая аннотация", val = 200)
    public static void myMeth(String  str, int x) {
        try {
            RepeatAnnos obj = new RepeatAnnos();
            Class<?> c = obj.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            
            //Первый способ вывода повторяющейся аннотации
            Annotation anno1 = m.getAnnotation(ContainerMyAnno.class);
            System.out.println(anno1);

            //Второй способ вывода повторяющейся аннотации
            MyAnno[] anno2 = m.getAnnotationsByType(MyAnno.class);
            for(MyAnno a : anno2)
                System.out.println(a.str() + " " + a.val());

        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }
    
    public static void main(String[] args) {
        myMeth("Тест", 1);
    }
}
