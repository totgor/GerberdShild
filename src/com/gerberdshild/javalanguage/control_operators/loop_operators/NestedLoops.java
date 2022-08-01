package com.gerberdshild.javalanguage.control_operators.loop_operators;

//Вложенные циклы.
public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) System.out.print(".");
            System.out.println();
        }
    }
}
