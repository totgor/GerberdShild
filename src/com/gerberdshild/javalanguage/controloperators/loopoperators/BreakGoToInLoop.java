package com.gerberdshild.javalanguage.controloperators.loopoperators;

//Применение оператора break для выхода из вложенных циклов.
public class BreakGoToInLoop {
    public static void main(String[] args) {
        first: for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if ( j == 10) break first; //происходит выход из обоих циклов
                System.out.print(j + " ");
            }
            System.out.println("Эта строка кода не будет выполняться.");
        }
        System.out.println("Циклы завершены.");
    }
}
