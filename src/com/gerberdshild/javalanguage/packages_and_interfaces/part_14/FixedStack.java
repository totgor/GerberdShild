package com.gerberdshild.javalanguage.packages_and_interfaces.part_14;

public class FixedStack implements IntStack {
    int[] Stack;
    int topStack;

    public FixedStack(int size) {
        Stack = new int[size];
        topStack = -1;
    }

    @Override
    public void push(int value) {
        if (topStack == Stack.length - 1)
            System.out.println("Стек переполнен.");
        else
            Stack[++topStack] = value;
    }

    @Override
    public int pop() {
        if (topStack == -1) {
            System.out.println("Стек пуст.");
            return 0;
        }
        return Stack[topStack--];
    }

}
