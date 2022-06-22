package com.gerberdshild.javalanguage.exceptionhandling.part_04;

import java.util.Random;

//Пример обработки ошибок и продолжения работы программы.
public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль.");
                a = 0; //присвоить а ноль и продолжить выполнение программы
            }
            System.out.println("a = " + a);
        }
    }
}
