package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.enumeration.part_03;

enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

//Применение предопределенных методов values() и valueOf().
//Более короткая запись цикла for в стиле foreach для Apple.values().
public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;

        //Применяем метод values()
        System.out.println("Все константы перечислимого типа Apple:");
        for(Apple a : Apple.values())
            System.out.println(a);
        System.out.println();

        //Применяем метод valueOf()
        ap = Apple.valueOf("RedDel");
        System.out.println("Значение переменной ap = " + ap);
    }    
}
