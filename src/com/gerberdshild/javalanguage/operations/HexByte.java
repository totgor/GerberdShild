package com.gerberdshild.javalanguage.operations;

//Сдвиг вправо. Маскирование двоичных разрядов расширения знака.
public class HexByte {
    public static void main(String[] args) {
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        byte b = (byte) 0xf1; //-15   2^3=8 2^2=4 2^1=2 2^0=1         00001111=15    11110001=-15
        System.out.println("b = " + b);
        System.out.println("b = 0x" + hex[b >> 4 & 0x0f] + hex[b & 0x0f]);
        /*
        что значит эта строка hex[b >> 4 & 0x0f]
        1.
        11110001 = -15
        >>4
        --------
        11111111

        2.
        11111111
        &0x0f
        00001111
        --------
        00001111 = f = 15
        3.
        hex[15] = f


        что значит эта строка hex[b & 0x0f]
        1.
        11110001 = -15
        &0x0f
        00001111
        --------
        00000001 = 1
        2.
        hex[1] = 1
        */
    }
}
