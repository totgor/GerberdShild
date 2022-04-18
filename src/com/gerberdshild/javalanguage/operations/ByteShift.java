package com.gerberdshild.javalanguage.operations;

//Сдвиг влево занчения типа byte
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64;
        byte b;
        int i;

        i = a << 2; //здесь тип byte приводится к int, поэтому старшие разряды при сдвиге не выпадают
        b = (byte) (a << 2); //здесь после сдвига результат заново приводится к типу byte, поэтому старшие разряды при сдвиге отпадают
        System.out.println("Первоначальное значение a = " + a);
        System.out.println("a << 2 = " + i);
        System.out.println("(byte) (a << 2) = " + b);
    }
}
