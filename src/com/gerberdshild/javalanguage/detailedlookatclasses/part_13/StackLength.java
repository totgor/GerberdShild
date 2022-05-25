package com.gerberdshild.javalanguage.detailedlookatclasses.part_13;

//Класс Stack в котором используется свойство length, для определения размерности массива.
class Stack {
    private int[] ArrayStack;
    private int topStack;

    Stack(int size) {
        ArrayStack = new int[size];
        topStack = -1;
    }

    void push(int value) {
        if (topStack == ArrayStack.length - 1) System.out.println("Стек заполнен.");
        else ArrayStack[++topStack] = value;
    }

    int pop() {
        if (topStack == -1) {
            System.out.println("Стек пуст.");
            return 0;
        }
        else return ArrayStack[topStack--];

    }
}

public class StackLength {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(9);

        for(int i = 0; i < 5; i++) myStack1.push(i);
        for(int i = 0; i < 8; i++) myStack2.push(i);

        System.out.println("Значения myStack1: ");
        for(int i = 0; i < 5; i++) System.out.print(myStack1.pop() + " ");
        System.out.println("\nЗначения myStack2: ");
        for(int i = 0; i < 8; i++) System.out.print(myStack2.pop() + " ");
    }
}
