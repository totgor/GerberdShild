package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.enumeration.part_07;

//Вывод ответов
public class AskMe {
    public static void answer(Answers result) {
        //NO, YES, MAYBE, LATER, SOON, NEVER
        switch(result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позже");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }
}
