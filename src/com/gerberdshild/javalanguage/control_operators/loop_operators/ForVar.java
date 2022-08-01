package com.gerberdshild.javalanguage.control_operators.loop_operators;

//Отдельные части оператора цикла for могут отсутствовать.
public class ForVar {
    public static void main(String[] args) {
        int i = 0;
        boolean done = false;

        for (; !done; ) {
            System.out.println("i = " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
