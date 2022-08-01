package com.gerberdshild.javalanguage.control_operators.loop_operators;

//Ипользование запятой в for.
public class CommaInFor {

    public static void NoComma() {
        System.out.println("No Comma:");
        int a, b;
        b = 4;
        for( a = 1; a < b; a++) {
            System.out.print("a = " + a);
            System.out.println(" b = " + b);
            b--;
        }
    }

    public  static void Comma() {
        System.out.println("Comma:");
        for(int a = 1, b = 4; a < b; a++, b--) {
            System.out.print("a = " + a);
            System.out.println(" b = " + b);
        }
    }

    public static void main(String[] args) {
        NoComma();
        Comma();
    }
}
