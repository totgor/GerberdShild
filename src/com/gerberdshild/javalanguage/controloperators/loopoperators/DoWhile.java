package com.gerberdshild.javalanguage.controloperators.loopoperators;

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
