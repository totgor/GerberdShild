package com.gerberdshild.javalanguage.control_operators.loop_operators;

//Тело цикла while может быть пустым.
public class WhileNoBody {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        //расчитать среднее значение i и j
        while (++i < --j); //у этого цикла отсутствует тело
        System.out.println("Среднее значение в i равно " + i);
        System.out.println("Такое же значение в j и равно " + i);
    }
}
