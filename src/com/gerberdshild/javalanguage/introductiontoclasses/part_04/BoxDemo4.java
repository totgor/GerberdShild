package com.gerberdshild.javalanguage.introductiontoclasses.part_04;

//Метод volume() возвращает значение.
class Box {
    double width; //ширина
    double height; //высота
    double depth; //глубина

    //расчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        //присвоить значеня первому параллелипипеду
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        //присвоить значеня второму параллелипипеду
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;
        System.out.println("Объём " + myBox1.volume());
        System.out.println("объём " + myBox2.volume());
    }
}
