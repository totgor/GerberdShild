package com.gerberdshild.javalanguage.packagesandinterfaces.part_08;

//Класс реализующий интерфес InterfaceStack. Фиксированный стек.
public class FixedStack implements InterfaceStack {
    int[] intStack; //массив для хранения значений стека
    int topStack; //вершина стека

    FixedStack(int size) {
        intStack = new int[size];
        topStack = -1;
    }

    @Override
    public void push(int value) {
        if (topStack == intStack.length - 1) System.out.println("Стек переполнен.");
        else intStack[++topStack] = value;
    }

    @Override
    public int pop() {
        if (topStack == -1) {
            System.out.println("Стек пуст.");
            return 0;
        }
        return intStack[topStack--];
    }
}
