package com.gerberdshild.javalanguage.operations;

//Поразрядные составные операции с присваиванием.
public class CompositeOperationsWithAssignment {
    public static void main(String[] args) {
        int a = 1; //0001
        int b = 2; //0010
        int c = 3; //0011
        a |= 4; //0001 | 0100 = 0101 = 5
        b >>= 1; //0010 >> 1 = 0001 = 1
        c <<= 1; //0011 << 1 = 0110 = 6
        a ^= c; //0101 ^ 0110 = 0011 = 3
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
