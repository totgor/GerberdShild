package com.gerberdshild.javalanguage.lambda.part_08;

// Пример захвата локальной переменной из объемлющего кода.
interface MyFunction {
    int function(int value);
}

public class VarCapture {
    public static void main(String[] args) {
        int num = 10; // Эта локальная переменная будет захвачена.

        MyFunction myFunction = (n) -> {
            // Т.к. num не изменяется, то такое применение num допустимо.
            int value = num + 10;
            return value;
            // Потпытка изменить захваченную переменную не допустима, теоретически она final.
            //num++;
        };

        // Действительно конечная переменная, т.к. она была использована в лямбда выражении.
        // Если её не использовать в лямбда-выражении, то изменять её можно.
        //num = 9;
    }
}
