package com.gerberdshild.javalanguage.operations;

//Беззнаковый сдвиг вправо двоичных разрядов значения типа byte.
public class ByteUShift {
    public static void main(String[] args) {
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        byte b = (byte) 0x0f1; //-15
        byte c = (byte) (b >> 4); //знаковый сдвиг вправо на 4 разряда для отрицатлеьного числа -15 типа byte
        byte d = (byte) (b >>> 4); //беззнаковый сдвиг вправо на 4 разряда для отрицательного числа -15 типа byte
        byte e = (byte) ((b & 0xff) >> 4); //знаковый сдвиг вправо на 4 разряда для отрицатлеьного числа -15 типа byte, с маскированием (поразрядной операцией &) - обнуляет старшие разряды
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println("b >> 4 = 0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println("b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println("(b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
    }
}
