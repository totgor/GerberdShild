package com.gerberdshild.javalanguage.control_operators.loop_operators;

//Применение оператора break для выхода из цикла.
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break; //выход из цикла, если i == 10
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершён.");
    }
}
