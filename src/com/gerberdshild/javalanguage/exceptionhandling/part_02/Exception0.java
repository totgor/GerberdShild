package com.gerberdshild.javalanguage.exceptionhandling.part_02;

//Пример необрабатываемого исключения.
public class Exception0 {
    static void soubroutine() {
        int d = 0;
        int a = 7 / d;
    }

    public static void main(String[] args) {
        Exception0.soubroutine();
    }
}
