package com.gerberdshild.javalanguage.packagesandinterfaces.part_13;

public class DynamicStack implements IntStack {
    int[] Stack; //стек
    int topStack; //вершина стека

    DynamicStack(int number) {
        Stack = new int[number];
        topStack = -1;
    }

    @Override
    public void push(int value) {
        if (topStack == (Stack.length - 1)) {
            int[] temp = new int[Stack.length * 2];
            for(int i = 0; i < Stack.length; i++) temp[i] = Stack[i];
            Stack = temp;
        }
        Stack[++topStack] = value;
    }

    @Override
    public int pop() {
        if(topStack == -1) {
            System.out.println("Стек пуст.");
            return 0;
        }
        return Stack[topStack--];
    }
}
