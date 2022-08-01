package com.gerberdshild.javalanguage.data_types_variables_arrays.type_conversion;

//приведение типов
public class TypeConversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("преобразование int в byte: ");
        b = (byte) i;
        System.out.println("b = " + b + " i = " + i);

        System.out.println("преобразование double в  int: ");
        i = (int) d;
        System.out.println("i = " + i + " d = " + d);

        System.out.println("преобразование double в  byte: ");
        b = (byte) d;
        System.out.println("b = " + b + " d = " + d);
    }
}
