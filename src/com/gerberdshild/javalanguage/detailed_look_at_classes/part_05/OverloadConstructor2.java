package com.gerberdshild.javalanguage.detailed_look_at_classes.part_05;

//Перегружаемый метод с возможностью инициализирования другим объектом.
class Box {
    double width;
    double height;
    double depth;

    //конструктор для неинициадизированного параллелипипеда
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //конструктор для различных параметров параллелипипеда
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //конструктор для куба
    Box(double cubeLength) {
        width = height = depth = cubeLength;
    }

    //инициализация другим объектом
    Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    //возвращение объёма
    double volume() {
        return width * height * depth;
    }
}

public class OverloadConstructor2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box(7);
        Box myBox3 = new Box(10, 20, 15);
        Box cloneBox = new Box(myBox3);

        System.out.println("Объём куба myBox1 = " + myBox1.volume());
        System.out.println("Объём куба myBox2 = " + myBox2.volume());
        System.out.println("Объём куба myBox3 = " + myBox3.volume());
        System.out.println("Объём куба cloneBox = " + cloneBox.volume());
    }
}
