package com.gerberdshild.javalanguage.packages_and_interfaces.part_08;

//Тестируем динамический стек.
public class TestDynamicStack {
    public static void main(String[] args) {
        DynamicStack myDynamicStack1 = new DynamicStack(5);
        DynamicStack myDynamicStack2 = new DynamicStack(8);

        for(int i = 0; i < 15; i++) myDynamicStack1.push(i);
        for(int i = 0; i < 20; i++) myDynamicStack2.push(i);

        System.out.println("Значений myDynamicStack1: ");
        for(int i = 0; i < 15; i++) System.out.print(myDynamicStack1.pop() + " ");
        System.out.println("\nЗначений myDynamicStack2: ");
        for(int i = 0; i < 20; i++) System.out.print(myDynamicStack2.pop() + " ");
    }
}
