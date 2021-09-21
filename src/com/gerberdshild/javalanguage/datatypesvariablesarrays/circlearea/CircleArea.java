package com.gerberdshild.javalanguage.datatypesvariablesarrays.circlearea;

//Площадь окружности
public class CircleArea {
    public static void main(String[] args) {
        double pi, r, a;
        r = 10.8; //радиус окружности
        pi = 3.1416; //приблизительное значение числа pi
        a = pi * r * r; //вычисление площади окружности
        System.out.println("Площадь круга равна " + a);
    }
}
