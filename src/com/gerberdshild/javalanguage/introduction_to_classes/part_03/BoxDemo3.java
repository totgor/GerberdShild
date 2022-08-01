package com.gerberdshild.javalanguage.introduction_to_classes.part_03;

//Пример введения метода в класс Box.
class Box {
    double width; //ширина
    double height; //высота
    double depth; //глубина

    //метод вывод объёма параллелипипеда
    void volume() {
        System.out.print("Объём ");
        System.out.println(width * height * depth);
    }
}


public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        //присваиваем значения переменным экземпляра myBox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        //присваиваем значения переменным экземпляра myBox2
        myBox2.width = 6;
        myBox2.height = 9;
        myBox2.depth = 3;
        //Выводим объёмы параллелипипедов
        myBox1.volume();
        myBox2.volume();
    }
}
