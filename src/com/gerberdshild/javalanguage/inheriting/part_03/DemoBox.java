package com.gerberdshild.javalanguage.inheriting.part_03;

//Расширение класса Box. Практичсекий пример.
class Box {
    double length;
    double height;
    double width;

    //копируем значения другого объекта.
    Box(Box object) {
        length = object.length;
        height = object.height;
        width = object.width;
    }

    //Все значения известны.
    Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    //Значения не определены.
    Box() {
        length = -1;
        height = -1;
        width = -1;
    }

    //Все стороны равны.
    Box(double value) {
        length = height = width = value;
    }

    //расчитать объём
    double volume() {
        return length * height * width;
    }
}

//Наследуем суперкласс Box(параллелипипед), добавляем поле weight(вес).
class BoxWeight extends Box{
    double weight;

    BoxWeight(double length, double height, double width, double weight) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }
}

//Наследуем суперкласс Box(параллелипипед), добавляем поле color(цвет).
class BoxColor extends Box{
    String color;

    BoxColor(double length, double height, double width, String color) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.color = color;
    }
}

public class DemoBox {
    public static void main(String[] args) {
        BoxWeight myBoxWeight = new BoxWeight(10, 20, 30, 154.3);
        System.out.println("Объём myBoxWeight = " + myBoxWeight.volume());
        System.out.println("Масса myBoxWeight = " + myBoxWeight.weight);
        System.out.println();
        BoxColor myBoxColor = new BoxColor(7, 8, 9, "Green");
        System.out.println("Объём myBoxColor = " + myBoxColor.volume());
        System.out.println("Цвет myBoxColor = " + myBoxColor.color);
    }
}
