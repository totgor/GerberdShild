package com.gerberdshild.javalanguage.inheriting.part_15;

//Применение абстрактных методов и классов.
abstract class Figure2D {
    double sizeA;
    double sizeB;

    Figure2D(double sizeA, double sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    abstract double area(); //абстрактный метод area()
}

class Rectangle extends Figure2D {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.print("Переопределённый абстрактный метод area() в Rectangle. Площадь: ");
        return sizeA * sizeB;
    }
}

class RightTriangle extends Figure2D {
    RightTriangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.print("Переопределённый абстрактный метод area() в RightTriangle. Площадь: ");
        return (sizeA * sizeB) / 2;
    }
}

public class AbstractCalcAreaFigure {
    public static void main(String[] args) {
        //Figure2D myFigure2 = new Figure2D(); //ошибка! создать обьект абстрактного класса не возможно!
        Rectangle myRectangle = new Rectangle(10, 12);
        RightTriangle myRightTriangle = new RightTriangle(5, 8);
        Figure2D refFigure2D;

        refFigure2D = myRectangle;
        System.out.println(refFigure2D.area());

        refFigure2D = myRightTriangle;
        System.out.println(refFigure2D.area());
    }
}
