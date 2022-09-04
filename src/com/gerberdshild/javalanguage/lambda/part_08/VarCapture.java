package com.gerberdshild.javalanguage.lambda.part_08;

// Пример захвата локальной переменной из объемлющего кода.
interface MyFunction {
    int function(int value);
}

public class VarCapture {
    
    static int static_value;
    
    static void method() {
        System.out.println("Это method().");
    }

    public static void main(String[] args) {
        int local_number = 10; // Эта локальная переменная будет захвачена.
        
        MyFunction myFunction = (n) -> {
            // Вызов метода из объемлющего класса допустим.
            method();

            //Изменение значения статической переменной из объемлющего класса, захват переменной не происходит.
            static_value = 10;
            static_value ++;            
            System.out.println("Значение static_value = " + static_value);            

            // Т.к. local_number не изменяется, то такое применение local_number допустимо.
            int value = local_number + static_value;
            return value;
            
            // Потпытка изменить захваченную переменную не допустима, теоретически она final.
            // local_number++;
        };

        System.out.println("Вызов лямбда-выражения: " + myFunction.function(100));
        // Действительно конечная переменная, т.к. она была использована в лямбда выражении.
        // Если её не использовать в лямбда-выражении, то изменять её можно.
        // local_number = 9;
    }
}
