package com.gerberdshild.javalanguage.exceptionhandling.part_12;

//Пример цепочки исключений.
public class ChainException {
    static void proc() {
        NullPointerException e = new NullPointerException("Исключение верхнего уровня");
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            proc();
        } catch(NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
            System.out.println("Первопрична: " + e.getCause());
        }
    }
}
