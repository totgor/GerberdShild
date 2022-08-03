package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.auto_boxing.part_06;

//Автоупаковка и распаковка Boolean и Character.
public class AutoBox6 {
    public static void main(String[] args) {
        //Упаковка значения типа boolean
        Boolean b = true;
        //Объект b атоматически распаковывается, когда употребляется в операторе if()
        if(b) System.out.println("Значение типа b = " + b);

        //Автоупаковка значения типа char
        Character ch1 = 'x';
        //Распаковка значения типа Character
        char ch2 = ch1;
        System.out.println("ch2 = " + ch2);
    }
}
