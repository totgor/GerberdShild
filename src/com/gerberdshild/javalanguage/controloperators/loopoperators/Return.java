package com.gerberdshild.javalanguage.controloperators.loopoperators;

//Применение оператора return.
public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("До вызова оператора return.");
        if (t) return;  //Если опустить условный оператор, то будет ошибка "недостижимый код!"
        System.out.println("Этот код не будет выполнене.");  //без if этот код не достижим
    }
}
