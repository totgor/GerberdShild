package com.gerberdshild.javalanguage.introductiontoclasses.part_05;

//В этой программе применяется метод с параметрами.
class Box {
    double width; //ширина
    double height; //высота
    double dept; //глубина

    //возвращет объём
    double volume() {
        return width * height * dept;
    }

    //устанавливаем размеры параллелипипеда
    void setSize(double w, double h, double d) {
        width = w;
        height = h;
        dept = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        myBox1.setSize(20, 10, 15);
        myBox2.setSize(3, 6, 9);
        System.out.println("Объём " + myBox1.volume());
        System.out.println("Объём " + myBox2.volume());
    }
}
