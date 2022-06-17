package com.gerberdshild.javalanguage.packagesandinterfaces.part_08;

//Класс реализующий интерфес InterfaceStack. Динамический стек.
public class DynamicStack implements InterfaceStack {
    int[] intStack;
    int topStack;

    DynamicStack(int size) {
        intStack = new int[size];
        topStack = -1;
    }

    @Override
    public void push(int value) {
        if(topStack == intStack.length - 1) {
            int[] temp = new int[intStack.length * 2]; //увеличиваем в два раза размер стека
            for (int i = 0; i < intStack.length; i++) temp[i] = intStack[i]; //копируем элементы массива
            intStack = temp; //старый стек ссылается на новый
        }
        intStack[++topStack] = value; //помещаем элемент в стек
    }

    @Override
    public int pop() {
        if (topStack == -1) {
            System.out.println("Стек пуст");
            return 0;
        }
        return intStack[topStack--];
    }
}
