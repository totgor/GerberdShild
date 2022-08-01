package com.gerberdshild.javalanguage.introduction_to_classes.part_08;

//Класс реализующий стек целочисленных значений, где можно хранить до 10 этих значений.
class Stack {
    int[] intStack = new int[10]; //массив для хранения значений стека
    int topStack; //вершина стека

    Stack() {
        topStack = -1; //инициализация вершины, стек пуст
    }

    //разместить значение в стеке
    void push(int value) {
        if (topStack == 9) System.out.println("Стек заполнен.");
        else intStack[++topStack] = value;
    }

    //извлеч значение из стека
    int pop() {
        if (topStack == -1) {
            System.out.println("Стек пуст.");
            return 0;
        }
        else return intStack[topStack--];
    }
}

//Тестируем стек.
public class TestStack {
    public static void main(String[] args) {
        Stack myDynamicStack1 = new Stack();
        Stack myDynamicStack2 = new Stack();

        //разместить чилса в стеках myDynamicStack1 и myDynamicStack2
        for (int i = 0; i < 10; i++) myDynamicStack1.push(i);
        for (int i = 10; i < 20; i++) myDynamicStack2.push(i);

        //извлеч числа из стека
        System.out.println("содержимое стека myDynamicStack1:");
        for (int i = 0; i < 10; i++) System.out.print(myDynamicStack1.pop() + " ");
        System.out.println("\nсодержимое стека myDynamicStack2:");
        for (int i = 0; i < 10; i++) System.out.print(myDynamicStack2.pop() + " ");

    }
}
