package com.gerberdshild.javalanguage.detailedlookatclasses.part_10;

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
        Stack myStack1 = new Stack(10);
        Stack myStack2 = new Stack(10);

        for(int i = 0; i < 10; i++) myStack1.push(i);
        for(int i = 10; i < 20; i++) myStack2.push(i);

        System.out.println("Значения myStack1:");
        for(int i = 0; i < 10; i++) System.out.print(myStack1.pop() + " ");
        System.out.println("\nЗначения myStack2:");
        for(int i = 0; i < 10; i++) System.out.print(myStack2.pop() + " ");
    }
}
