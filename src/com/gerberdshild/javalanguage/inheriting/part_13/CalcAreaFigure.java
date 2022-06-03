package com.gerberdshild.javalanguage.inheriting.part_13;

//Применение динамического полиморфизма (переопределение методов).
//2D фигура
class Figure2D {
    double sizeA;
    double sizeB;

    Figure2D(double sizeA, double sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    double area() {
        System.out.print("Метод area() в Figure2D. Площадь фигуры не определена: ");
        return 0;
    }
}

//четырёхуголник
class Rectangle extends Figure2D {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.print("Метод area() в Rectangle. Площадь прямоугольника: ");
        return sizeA * sizeB;
    }
}

//прямоуголный треуголник S = 1/2 * a * b, хотя площадь любого треуголника S = 1/2 * a * h;
class RightTriangle extends Figure2D {
    RightTriangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.print("Метод area() в RightTriangle. Площадь прямоугольного треугольнка: ");
        return (sizeA * sizeB) / 2;
    }
}


public class CalcAreaFigure {
    public static void main(String[] args) {
        Figure2D myFigure2D = new Figure2D(10, 10);
        Rectangle myRectangle = new Rectangle(6, 7);
        RightTriangle myRightTriangle = new RightTriangle(8, 9);

        Figure2D refFigure2D;

        refFigure2D = myFigure2D;
        System.out.println(refFigure2D.area());

        refFigure2D = myRectangle;
        System.out.println(refFigure2D.area());

        refFigure2D = myRightTriangle;
        System.out.println(refFigure2D.area());
    }
}
