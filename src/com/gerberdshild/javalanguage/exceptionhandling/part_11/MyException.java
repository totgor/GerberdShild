package com.gerberdshild.javalanguage.exceptionhandling.part_11;

//Пример собственного класса исключения, производного от Exception.
public class MyException extends Exception {
    private int a;

    MyException(int a) {
        this.a = a;
    }

    //Переопределение метода toString(), чтобы не выводить "имя исключения двоеточие"
    public String toString() {
        return "MyException [" + a + "].";
    }
}
