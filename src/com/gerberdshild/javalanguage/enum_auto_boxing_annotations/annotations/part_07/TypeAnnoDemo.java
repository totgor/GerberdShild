package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.annotations.part_07;

import java.lang.annotation.*;
import java.lang.reflect.*;

//Типовые  аннотации
@Target(ElementType.TYPE_USE)       //Аннотация-маркер, которую можно применить к типу данных
@interface TypeAnno {
}

@Target(ElementType.TYPE_USE)       //Аннотация-маркер, которую можно применить к типу данных
@interface NotZeroLen {
}

@Target(ElementType.TYPE_USE)       //Аннотация-маркер, которую можно применить к типу данных
@interface Unique {    
}

@Target(ElementType.TYPE_USE)       //Параметризированная одночленная аннотация, которую можно применить к типу данных
@interface MaxLen {
    int value();
}


//Не типовые аннотации
@Target(ElementType.FIELD)          //Аннотация-маркер, которую можно применить к объявлению поля
@interface EmptyOK {    
}

@Target(ElementType.METHOD)         //Аннотация маркер, которую можно применить к объявлению метода
@interface Recommended {    
}

@Target(ElementType.TYPE_PARAMETER) //Параметризированная аннотация, которую можно применить к параметру типа
@interface What {
    String Description();
}

//Применить аннотацию в парметре типа
public class TypeAnnoDemo <@What (Description = "Данные обобщенного типа") T>{ 
    
    //Применить типовую аннотацию в конструкторе
    public @Unique TypeAnnoDemo() { 
    }
    
    //Аннотировать тип, но не поле (в данном случае String)
    @TypeAnno String str;           

    //Аннотировать поле
    @EmptyOK String test;           

    //Применить типовую аннотацию для аннотирования ссылки this на объект
    public int function1(@TypeAnno TypeAnnoDemo<T> this, int x) { 
        return 10;
    }

    //Аннотировать возвращаемый тип
    public @TypeAnno Integer function2(int j, int k) { 
        return j + k;
    }

    //Аннотировать объявление метода
    public @Recommended Integer function3(String str) { 
        return str.length() / 2;
    }

    //применить типовую аннотацию в операторе throws
    public void function4() throws @TypeAnno NullPointerException {    
        //...
    }

    //Аннотировать уровни доступа к массиву
    String @MaxLen(10) [] @NotZeroLen [] array; 

    //Аннотировать тип элемента массива
    @TypeAnno Integer[] vector;

    public static void myMeth(int i) {

        //Применить типовую аннотацию в аргументе типа
        TypeAnnoDemo<@TypeAnno Integer> obj1 = new TypeAnnoDemo<@TypeAnno Integer>();
        
        //Применить типовую аннотацию в операторе new
        @Unique TypeAnnoDemo<Integer> obj2 = new @Unique TypeAnnoDemo<Integer>();

        Object x = new Integer(10);
        Integer y;

        //Применить типовую аннотацию к приведению типов
        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(100);
    }
}
