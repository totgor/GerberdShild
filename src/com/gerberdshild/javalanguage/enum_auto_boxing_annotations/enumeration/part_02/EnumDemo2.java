package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.enumeration.part_02;

enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

//Применение предопределенных методов values() и valueOf().
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        //Применяем метод values()
        Apple apples[] = Apple.values();
        System.out.println("Все константы перечислимого типа Apple:");
        for(Apple a : apples)
            System.out.println(a);
        System.out.println();

        //Применяем метод valueOf()
        ap = Apple.valueOf("RedDel");
        System.out.println("Значение переменной ap = " + ap);
    }    
}
