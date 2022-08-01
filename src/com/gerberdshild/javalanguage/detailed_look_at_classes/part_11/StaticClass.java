package com.gerberdshild.javalanguage.detailed_look_at_classes.part_11;

//Пример использования статических static переменных, методов и блока кода.
public class StaticClass {
    static int a = 3; //1. как только загружается класс StaticClass, выполняется все статические операторы
    static int b;

    static void staticMethod(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    //2. затем выполняется статический блок кода
    static {
        System.out.println("Инициализация статического блока.");
        b = a * 4;
    }

    //3. выполняется метод main(), который вызывает метод staticMethod()
    public static void main(String[] args) {
        staticMethod(38);
    }
}
