package com.gerberdshild.javalanguage.packages_and_interfaces.part_14;

//Практичный пример исползования default метода.
public class TestStack {
    public static void main(String[] args) {
        FixedStack fixedStack = new FixedStack(10);
        DynamicStack dynamicStack = new DynamicStack(10);

        for (int i = 0; i < 10; i++)
            fixedStack.push(i);
        for (int i = 0; i < 20; i++)
            dynamicStack.push(i);

        System.out.println("Values fixedStack:");
        for (int i = 0; i < 10; i++)
            System.out.print(fixedStack.pop() + " ");
        System.out.println();
        fixedStack.clear();

        System.out.println("Values dynamicStack:");
        for (int i = 0; i < 20; i++)
            System.out.print(dynamicStack.pop() + " ");
        System.out.println();
        dynamicStack.clear(); //функция не проверяет, пуст и сейчас стек
    }
}
