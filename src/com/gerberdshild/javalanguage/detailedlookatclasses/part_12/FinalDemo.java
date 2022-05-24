package com.gerberdshild.javalanguage.detailedlookatclasses.part_12;

//Пример использования final.
class Final {
    final double PI = 3.14; //обьявляем константу
    final int MAX; //обьявляем константу, инициализируем в конструкторе класса
    int min;

    Final(int value) {
        System.out.println("Инициализируем final поле MAX  в конструкторе.");
        MAX = value;
        //PI = 32.1; //приведёт к ошибке
        //MAX = 34; //приведёт к ошибке, один раз уже инициализирована константа
    }

    void printPI() {
        System.out.println("final поле PI инициализированно в объяылении поля.");
        System.out.println("PI = " + PI);
    }

    void printMAX() {
        System.out.println("MAX = " + MAX);
    }

    void setMin(final int value) {
        System.out.println("Инициализируем поле min, final полем value.");
        min = value;
        //value = 14; //приведет к ошибке
    }

    void printMin() {
        System.out.println("min = " + min);
    }

    void printLocalVariable() {
        final int VARIABLE;
        VARIABLE = 100;
        System.out.println("Объявляем локальное final поле VARIABLE и инициализируем единыжды.");
        //VARIABLE = 324; //приведёт к ошибке, константу можно инициализировать один раз
        System.out.println("VARIABLE = " + VARIABLE);
    }

}

public class FinalDemo {
    public static void main(String[] args) {
        Final myFinal = new Final(500);
        myFinal.printPI();
        myFinal.printMAX();
        myFinal.setMin(10);
        myFinal.printMin();
        myFinal.printLocalVariable();
    }
}
