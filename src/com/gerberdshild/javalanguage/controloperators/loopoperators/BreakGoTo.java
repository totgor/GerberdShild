package com.gerberdshild.javalanguage.controloperators.loopoperators;

//Применение оператора break в качестве цивилизованной формы goto.
public class BreakGoTo {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Оператор в третьем блоке, предшествует break.");
                    if (t) break second;
                    System.out.println("Этот оператор не будет выполняться.");
                }
                System.out.println("Этот оператор не будет выполняться.");
            }
            System.out.println("Этот оператор следует за блоком кода second.");
        }
    }
}
