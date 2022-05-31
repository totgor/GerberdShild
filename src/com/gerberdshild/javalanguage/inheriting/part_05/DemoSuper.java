package com.gerberdshild.javalanguage.inheriting.part_05;

//Пример использования ключевого слова super.
class Box {
    private double width;
    private double height;
    private double depth;

    //клонирование объекта
    Box(Box object) {
        width = object.width;
        height = object.height;
        depth = object.depth;
    }

    //знаем все размеры
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //нет размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //куб
    Box(double length) {
        width = height = depth = length;
    }

    //вычислить объём
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    //переобпределяем все конструкторы через super
    BoxWeight(BoxWeight object) {
        super(object);
        weight = object.weight;
    }

    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    BoxWeight() {
        super();
        this.weight = -1;
    }

    BoxWeight(double length, double weight) {
        super(length);
        this.weight = weight;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight myBoxWeight1 = new BoxWeight(6, 7, 8, 152.3);
        BoxWeight myBoxWeight2 = new BoxWeight(2, 3, 4, 89.4);
        BoxWeight myBoxWeight3 = new BoxWeight();
        BoxWeight cloneBoxWeight = new BoxWeight(myBoxWeight2);
        BoxWeight cubeBoxWeight = new BoxWeight(10, 201.4);

        System.out.println("Объём myBoxWeight1 = " + myBoxWeight1.volume());
        System.out.println("Масса myBoxWeight1 = " + myBoxWeight1.weight + "\n");
        System.out.println("Объём myBoxWeight2 = " + myBoxWeight2.volume());
        System.out.println("Масса myBoxWeight2 = " + myBoxWeight2.weight + "\n");
        System.out.println("Объём myBoxWeight3 = " + myBoxWeight3.volume());
        System.out.println("Масса myBoxWeight3 = " + myBoxWeight3.weight + "\n");
        System.out.println("Объём cubeBoxWeight = " + cubeBoxWeight.volume());
        System.out.println("Масса cubeBoxWeight = " + cubeBoxWeight.weight + "\n");
        System.out.println("Объём cloneBoxWeight = " + cloneBoxWeight.volume());
        System.out.println("Масса cloneBoxWeight = " + cloneBoxWeight.weight);
    }
}
