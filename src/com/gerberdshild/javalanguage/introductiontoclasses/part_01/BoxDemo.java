package com.gerberdshild.javalanguage.introductiontoclasses.part_01;

//Пример использования класса.

//класс описывающий параллелипипед
class Box {
    double width; //ширина
    double hight; //высота
    double depth; //глубина
}

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        //присваиваем значения переменным экзмепляра класса myBox
        myBox.width = 10;
        myBox.hight = 20;
        myBox.depth = 15;

        //расчитать объём параллелипипеда
        vol = myBox.width * myBox.hight * myBox.depth;

        System.out.println("Объём параллелипипеда = " + vol);
    }
}
