package com.gerberdshild.javalanguage.exceptionhandling.part_12;

//Пример цепочки исключений. Что если учеличить глубину цепочки.
public class ChainException {
    static void proc() {
        NullPointerException e = new NullPointerException("Исключение верхнего уровня");
        e.initCause(new ArithmeticException("причина").initCause(new IndexOutOfBoundsException("причина причины")));
        throw e;
    }

    public static void main(String[] args) {
        try {
            proc();
        } catch(NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
            System.out.println("Первопрична: " + e.getCause());
            System.out.println("Причина причины: " + e.getCause().getCause());
        }
    }
}
