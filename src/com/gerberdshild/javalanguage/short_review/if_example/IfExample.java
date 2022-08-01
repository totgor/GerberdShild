package com.gerberdshild.javalanguage.short_review.if_example;

//Условный оператор If
public class IfExample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y " );
        System.out.println("x = " + x + " y = " + y);
        System.out.println("____________________________");

        x = x * 2;
        if (x == y) System.out.println("x равно y");
        System.out.println("x = " + x + " y = " + y);
        System.out.println("____________________________");

        x = x * 2;
        if (x > y) System.out.println("x больше y");
        System.out.println("x = " + x + " y = " + y);
        System.out.println("____________________________");

        if (x != y) System.out.println("х не равно y");
        System.out.println("x = " + x + " y = " + y);

    }
}
