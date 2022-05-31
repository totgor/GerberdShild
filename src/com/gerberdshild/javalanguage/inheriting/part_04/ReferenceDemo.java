package com.gerberdshild.javalanguage.inheriting.part_04;

//Пример использования переменной суперкласса, как ссылки на подкласс.
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
class BoxWeight extends Box {
    double weight;

    BoxWeight(double length, double height, double width, double weight) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }
}

public class ReferenceDemo {
    public static void main(String[] args) {
        BoxWeight myBoxWeight = new BoxWeight(3, 6, 7, 153.4);
        Box myBox = new Box();

        System.out.println("Объём myBoxWeight = " + myBoxWeight.volume());
        System.out.println("Масса myBoxWeight = " + myBoxWeight.weight);

        myBox = myBoxWeight;
        System.out.println("Объём myBox = " + myBox.volume());
        //System.out.println("Масса myBox = " + myBox.weight); //Ошибка!!! Доступ к полям подкласса, через ссылку суперкласса определяется типом суперкласса, а не типом подкласса.

    }
}
