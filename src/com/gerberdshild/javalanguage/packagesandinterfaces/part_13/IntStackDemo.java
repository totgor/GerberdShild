package com.gerberdshild.javalanguage.packagesandinterfaces.part_13;

//Пример использования заркытых (private) методов интерфейса.
public class IntStackDemo {
    public static void main(String[] args) {
        int[] temp; //для вывода
        //Стек в виде динамического массива
        DynamicStack myDynamicStack1 = new DynamicStack(5);
        DynamicStack myDynamicStack2 = new DynamicStack(8);
        //Заполнили стек значениями
        for (int i = 0; i < 10; i++) myDynamicStack1.push(i);
        for (int i = 0; i < 16; i++) myDynamicStack2.push(i);
        //Вывели 6 верхних значений
        temp = myDynamicStack1.popNElements(6);
        for (int i = 0; i < 6; i++) System.out.print(temp[i] + " ");
        System.out.println();
        //После пропуска 3х верхних значений, вывели 6 следующих значений
        temp = myDynamicStack2.skipAndPopNElements(3, 6);
        for (int i = 0; i < 6; i++) System.out.print(temp[i] + " ");
        System.out.println();

        //Стек в виде списка
        ListStack myListStack1 = new ListStack();
        ListStack myListStack2 = new ListStack();
        //Заполнили стек значениями
        for (int i = 0; i < 14; i++) myListStack1.push(i);
        for (int i = 0; i < 23; i++) myListStack2.push(i);
        //Вывели 6 верхних значений
        temp = myListStack1.popNElements(6);
        for (int i = 0; i < 6; i++) System.out.print(temp[i] + " ");
        System.out.println();
        //После пропуска 3х верхних значений, вывели 6 следующих значений
        temp = myListStack2.skipAndPopNElements(3, 6);
        for (int i = 0; i < 6; i++) System.out.print(temp[i] + " ");
        System.out.println();
    }
}
