package com.gerberdshild.javalanguage.lambda.part_01;

// Применение простого лямбда-выражения.
// Функциональный интерфейс.
interface MyNumber {
    double getValue();
}

public class LambdaExpression {
    public static void main(String[] args) {
        // ОБъявить ссылку на функциональный интерфейс.
        MyNumber myNumber;
        // Здесь лямбда-выражение является константным выражением.
        // Когда оно присваивается ссылочной переменной muNumber, получается экземпляр класса, в котором 
        // лямбда-выражение реализует метод getValue() из функционального интерфейса MyNumber.         
        myNumber = () -> 123.45;
        // Вызвать метод getValue() предоставленный лямбда-выражением.
        System.out.println("Лямбда-выражение является константой: " + myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println("Случайное значение: " + myNumber.getValue());
        System.out.println("Другое случайное значение: " + myNumber.getValue());
        
        //Лямбда-выражение должно быть совместимо по типу данных с абстрактным методом.
        //myNumber = () -> "Строка."; //Ошибка!
    }
}
