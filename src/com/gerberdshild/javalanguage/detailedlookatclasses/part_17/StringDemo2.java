package com.gerberdshild.javalanguage.detailedlookatclasses.part_17;

//Продемонстрировать некоторые методы класса String.
public class StringDemo2 {
    public static void main(String[] args) {
        String strObject1 = "Первая строка";
        String strObject2 = "Вторая строка";
        String strObject3 = strObject1;

        System.out.println("Длина строки sreObject1 = " + strObject1.length());
        System.out.println("Третьим символом строки strObject1 = " + strObject1.charAt(3));
        if (strObject1.equals(strObject2)) System.out.println("strObject1 == strObject2");
        else System.out.println("strObject1 != strObject2");
        if (strObject1.equals(strObject3)) System.out.println("strObject1 == strObject3");
        else System.out.println("strObject1 != strObject3");
    }
}
