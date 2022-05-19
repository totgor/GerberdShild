package com.gerberdshild.javalanguage.introductiontoclasses.part_06;

//Пример использования конструктора в классе Box для инициализации размеров параллелипипеда.
class Box {
    double width; //ширина
    double height; //высота
    double depth; //глубина

    Box() {
        System.out.println("Конструктор класса Box.");
        width = 10;
        height = 10;
        depth = 10;
    }

    //возвращаем объём
    double volume() {
        return width * height * depth;
    }

}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        System.out.println("Объём " + myBox1.volume());
        System.out.println("Объём " + myBox2.volume());
    }
}
