package com.gerberdshild.javalanguage.introduction_to_classes.part_07;

//Пример параметризованного конструктора. Передаем значения через параметры конструктора класса Box. Инициализируем переменные.
class Box {
    double width;
    double height;
    double depth;

    //параметризированный конструктор
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Возвратить объём
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        System.out.println("Объём " + myBox1.volume());
        System.out.println("Объём " + myBox2.volume());
    }
}
