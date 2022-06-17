package com.gerberdshild.javalanguage.packagesandinterfaces.part_08;

//Тестируем фиксированный стек
public class TestFixedStack {
    public static void main(String[] args) {
        FixedStack myFixedStack1 = new FixedStack(5);
        FixedStack myFixedStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) myFixedStack1.push(i);
        for (int i = 0; i < 8; i++) myFixedStack2.push(i);
        System.out.println("Значения myFixedStack1: ");
        for (int i = 0; i < 5; i++) System.out.print(myFixedStack1.pop() + " ");
        System.out.println("\nЗначения myFixedStack2: ");
        for (int i = 0; i < 8; i++) System.out.print(myFixedStack2.pop() + " ");
    }
}
