package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.enumeration;

//Пример перечисления enum.
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple apple;
        apple = Apple.GoldenDel;
        
        //Выводим значение перечислимого типа apple
        System.out.println("Значение apple: " + apple);
        System.out.println();
        
        //Срваниваем переменную перечислимого типа
        apple = Apple.RedDel;
        if (apple == Apple.RedDel) System.out.println("Переменная apple содержит RedDel");
        System.out.println();
        
        //Применение перечисления для управления оператором switch()
        //Для указания именованных констант в операторе switch() из перечисления Apple указывать уточняющее имя Apple.константа_перечисления не надо!        
        //Тип перечисления в switch(apple) уже неявно задает тип перечисления для выражений ветвей case.
        switch(apple) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Сорт Golden Delicious жёлтый.");
                break;
            case RedDel:
                System.out.println("Сорт Red Delicious красный.");
                break;
            case Winesap:
                System.out.println("Сорт Winesap красный.");
                break;
            case Cortland:
                System.out.println("Сорт Cortland красный.");
                break;
            default:
                System.out.println("По идее подобный вывод не возможен, т.к. компилятор не пропустит присвоение преременной apple значения не из перечисления Apple.");
                break;
        }
    }
}
