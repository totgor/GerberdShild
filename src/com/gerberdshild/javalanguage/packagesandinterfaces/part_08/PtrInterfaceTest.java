package com.gerberdshild.javalanguage.packagesandinterfaces.part_08;

//Тестируем доступ к классам фиксированного и динамического стека по ссылке на интерфейс.
public class PtrInterfaceTest {
    public static void main(String[] args) {
        DynamicStack myDynamicStack = new DynamicStack(5);
        FixedStack myFixedStack = new FixedStack(8);
        InterfaceStack ptrInterfaceStack;

        ptrInterfaceStack = myDynamicStack;
        for (int i = 0; i < 12; i++) ptrInterfaceStack.push(i);

        ptrInterfaceStack = myFixedStack;
        for (int i = 0; i < 8; i++) ptrInterfaceStack.push(i);

        ptrInterfaceStack = myDynamicStack;
        System.out.print("Значения myDynamicStack: ");
        for (int i = 0; i < 12; i++) System.out.print(ptrInterfaceStack.pop() + " ");

        ptrInterfaceStack = myFixedStack;
        System.out.print("\nЗначения myFixedStack: ");
        for (int i = 0; i < 8; i++) System.out.print(ptrInterfaceStack.pop() + " ");
    }
}
