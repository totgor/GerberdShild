package com.gerberdshild.javalanguage.controloperators.loopoperators;

//Применение оператора continue с меткой.
public class ContinueLabel {
    public static void main(String[] args) {
        next: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) { //Исключаем повторяющиейся значения. Выводим Треугольную таблицу умножения.
                    System.out.println();
                    continue next;
                }
                System.out.print(i + "x" + j + "=" + (i * j) + " ");
            }
        }
    }
}
