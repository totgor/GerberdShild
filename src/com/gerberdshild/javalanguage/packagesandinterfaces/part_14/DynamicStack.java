package com.gerberdshild.javalanguage.packagesandinterfaces.part_14;

public class DynamicStack implements IntStack {
    int[] Stack;
    int topStack;

    DynamicStack(int size) {
        Stack = new int[size];
        topStack = -1;
    }

    public void push(int value) {
        if (topStack == Stack.length - 1) {
            int[] temp = new int[Stack.length * 2];
            for (int i = 0; i < Stack.length; i++) temp[i] = Stack[i];
            Stack = temp;
        }
        Stack[++topStack] = value;
    }

    public int pop() {
        if (topStack == -1) {
            System.out.println("Стек пуст.");
            return 0;
        }
        return Stack[topStack--];
    }

    public void clear() {
        Stack = new int[Stack.length];
        topStack = -1;
        System.out.println("Стек очищен.");
    }

}