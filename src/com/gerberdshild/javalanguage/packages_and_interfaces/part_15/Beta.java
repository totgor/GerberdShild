package com.gerberdshild.javalanguage.packages_and_interfaces.part_15;

public interface Beta extends Alpha {
    default void method() {        
        System.out.println("Метод по молчанию в Beta интерфейсе.");
        Alpha.super.method(); //Если я хочу вызвать defaul-метод c одинаковой сигнатурой из Alpha интерфейса
    }
}
