package com.gerberdshild.javalanguage.packages_and_interfaces.part_09;

import java.util.Random;

class Question implements SharedConstants {
    private Random rand = new Random(); //создаем объект для получения псевдослучайных чисел

    //получить псевдослучайное число от 0 до 5
    int ask() {
        int value = (int) (100 * rand.nextDouble()); //полчить вещественное число от 0.0 до 1.0, довести до 2х значного, преобразовать к целочисленному int-у, отбросив дробь
        if (value < 25) return NO; //25%
        else if (value < 50) return YES; //25%
        else if (value < 65) return MAYBE; //15%
        else if (value < 75) return LATER; //10%
        else if (value < 98) return SOON;  //13%
        else return NEVER; //2%
    }
}
