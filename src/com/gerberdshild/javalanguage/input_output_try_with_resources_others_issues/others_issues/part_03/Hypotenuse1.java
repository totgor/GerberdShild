package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.others_issues.part_03;

//Не применяется статический импорт.
public class Hypotenuse1 {
    static double side1 = 3.0, side2 = 4.0, hypot;

    public static void main(String[] args) {
        // Приходится указывать имя класса Math для вызова статических методов sqrt() и pow()
        hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("При длине сторон прямоугольного треуголника: side1 = " + side1 + " и side2 = " + side2 + " гипотенуза равна " + hypot);
    }

}
