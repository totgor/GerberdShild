package com.gerberdshild.javalanguage.introduction_to_classes.part_02;

//Пример использования двух обьектов класса Box.
class Box {
    double width; //ширина
    double height; //высота
    double depth; //глубина
}

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double vol1, vol2;

        //присвоить значения переменным первого параллелипипеда
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        //присвоить значения переменным второго параллелипипеда
        myBox2.width = 6;
        myBox2.height = 9;
        myBox2.depth = 3;

        vol1 = myBox1.width * myBox1.height * myBox1.depth; //расчитать объём первого параллелипипеда
        vol2 = myBox2.width * myBox2.height * myBox2.depth; //расчитать объём второго параллелипипеда

        //вывод значений
        System.out.println("Объём myBox1 = " + vol1);
        System.out.println("Объём myBox2 = " + vol2);
    }
}
