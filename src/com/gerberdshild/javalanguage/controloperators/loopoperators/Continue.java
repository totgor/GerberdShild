package com.gerberdshild.javalanguage.controloperators.loopoperators;

//Применение оператора continue.
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue; //Если число четное, то перевод строки не осущетсвляем.
            System.out.println();
        }
    }
}
