package com.gerberdshild.javalanguage.detailed_look_at_classes.part_03;

//Перегрузка конструкторов.
class Box {
    double width;
    double height;
    double depth;

    //констпуктор для параллелипипеда с различными размерами
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //конструктор неинициализированного параллелипипеда
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //конструктор для куба
    Box(double cubeLength) {
        width = height = depth = cubeLength;
    }

    //возвращаем объём параллелипипеда
    double volume() {
        return width * height * depth;
    }
}

public class OverloadConstructor {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(7);
        Box myBox3 = new Box();

        System.out.println("Объём myBox1 = " + myBox1.volume());
        System.out.println("Объём myBox2 = " + myBox2.volume());
        System.out.println("Объём myBox3 = " + myBox3.volume());
    }
}
