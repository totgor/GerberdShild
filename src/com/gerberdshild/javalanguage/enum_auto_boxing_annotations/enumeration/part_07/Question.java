package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.enumeration.part_07;

import java.util.Random;

//Ответы
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

// Вопросы
public class Question {
    Random rnd = new Random();

    public Answers ask() {
        int getNum = (int) (rnd.nextDouble() * 100);
        if (getNum < 25) return Answers.NO;
        else if (getNum < 50) return Answers.YES;
        else if (getNum < 65) return Answers.MAYBE;
        else if (getNum < 75) return Answers.LATER;
        else if (getNum < 98) return Answers.SOON;
        else return Answers.NEVER;
    }
}
