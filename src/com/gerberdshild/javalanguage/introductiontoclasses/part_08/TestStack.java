package com.gerberdshild.javalanguage.introductiontoclasses.part_08;

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
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //разместить чилса в стеках myStack1 и myStack2
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);

        //извлеч числа из стека
        System.out.println("содержимое стека myStack1:");
        for (int i = 0; i < 10; i++) System.out.print(myStack1.pop() + " ");
        System.out.println("\nсодержимое стека myStack2:");
        for (int i = 0; i < 10; i++) System.out.print(myStack2.pop() + " ");

    }
}
