package com.gerberdshild.javalanguage.inheriting.part_07;

//Пример множественного наследования.
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

    //все значения
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //конструктор по умолчанию
    Box() {
        width = height = depth = -1;
    }

    //куб
    Box(double length) {
        width = height = depth = length;
    }

    //посчитать объём
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    //клонирование
    BoxWeight(BoxWeight object) {
        super(object);
        weight = object.weight;
    }

    //все размеры и вес
    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    //конструктор по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }

    //куб + вес
    BoxWeight(double length, double weight) {
        super(length);
        this.weight = weight;
    }
}

class Shipment extends BoxWeight {
    double cost;

    //клонирование
    Shipment(Shipment object) {
        super(object);
        cost = object.cost;
    }

    //все размеры, вес, цена
    Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    //конструктор по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    //куб + вес + цена
    Shipment(double length, double weight, double cost) {
        super(length, weight);
        this.cost = cost;
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Shipment myShipment1 = new Shipment(6, 7, 8, 18.2, 1.34);
        Shipment myShipment2 = new Shipment(10, 20, 15, 120.2, 5.23);
        System.out.println("Объём myShipment1 = " + myShipment1.volume());
        System.out.println("Вес myShipment1 = " + myShipment1.weight);
        System.out.println("Стоимость доставки myShipment1 = \u20BD" + myShipment1.cost);
        System.out.println("\nОбъём myShipment2 = " + myShipment2.volume());
        System.out.println("Вес myShipment2 = " + myShipment2.weight);
        System.out.println("Стоимость доставки myShipment2 =  \u20BD" + myShipment2.cost);

    }
}
