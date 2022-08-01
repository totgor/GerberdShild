package com.gerberdshild.javalanguage.detailed_look_at_classes.part_10;

//Стек с модификаторами доступа.
class Stack {
    private int[] intStack; //массив для хранения элементов стека
    private int topStack; //вершина стека

    Stack(int n) {
        intStack = new int[n];
        topStack = -1;
    }

    void push(int value) {
        if (topStack == 9) System.out.println("Стек заполнен.");
        else intStack[++topStack] = value;
    }

    int pop() {
        if (topStack == -1) {
            System.out.println("Стек пуст.");
            return 0;
        }
        else return intStack[topStack--];
    }
}

public class StackWithAccessModifiers {
    public static void main(String[] args) {
        Stack myDynamicStack1 = new Stack(10);
        Stack myDynamicStack2 = new Stack(10);

        for(int i = 0; i < 10; i++) myDynamicStack1.push(i);
        for(int i = 10; i < 20; i++) myDynamicStack2.push(i);

        System.out.println("Значения myDynamicStack1:");
        for(int i = 0; i < 10; i++) System.out.print(myDynamicStack1.pop() + " ");
        System.out.println("\nЗначения myDynamicStack2:");
        for(int i = 0; i < 10; i++) System.out.print(myDynamicStack2.pop() + " ");
    }
}
