package com.gerberdshild.javalanguage.control_operators.loop_operators;

//Подобное применение оператора break как goto приведет к ошибке.
public class BreakGoToError {
    public static void main(String[] args) {
        one: for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
        }

        for (int j = 0; j < 100; j++) {
            //if (j == 10) break one; //Такой переход не возможен! Ошибка компиляции!
            System.out.print(j + " ");
        }
    }
}
