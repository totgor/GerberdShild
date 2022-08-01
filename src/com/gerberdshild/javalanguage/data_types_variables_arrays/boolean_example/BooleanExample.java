package com.gerberdshild.javalanguage.data_types_variables_arrays.boolean_example;

//Пример использования типа boolean
public class BooleanExample {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);
        //пример использования типа boolean в операторе if
        if (b) System.out.println("Этот код выаолняется");
        b = false;
        if (b) System.out.println("Этот код не выаолняется");
        //результат сравнения
        System.out.println("10 > 9 = " + (10 > 9));
    }
}
