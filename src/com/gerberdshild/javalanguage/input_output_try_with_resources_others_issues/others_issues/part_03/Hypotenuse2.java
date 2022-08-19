package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.others_issues.part_03;

import static java.lang.Math.*;

//Применение статического импорта позволяет использовать статические методы без указания имени класса.
public class Hypotenuse2 {
    static double side1 = 3.0, side2 = 4.0, hypot;
    public static void main(String[] args) {
        //Имя класса Math при вызове методов sqrt() и pow() можно не указывать. Код становится более лакончиным.
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("При длине сторон прямоугольного треуголника: side1 = " + side1 + " и side2 = " + side2 + " гипотенуза равна " + hypot);
    }

}
