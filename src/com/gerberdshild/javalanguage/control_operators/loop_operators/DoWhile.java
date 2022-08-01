package com.gerberdshild.javalanguage.control_operators.loop_operators;

//Пример цикла do-while.
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);
    }
}
