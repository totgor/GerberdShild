package com.gerberdshild.javalanguage.detailed_look_at_classes.part_20;

//Перегрузка методов с аргументами переменной длины.
public class OverloadMethodsWithArgumentsVarLength {
    static void printArguments(int... arrayArguments) {
        System.out.print("void PrintArguments(int... arrayArguments) " + "Колличество аргументов переменной: " + arrayArguments.length + " Содержимое: "  );
        for(int value : arrayArguments)
            System.out.print(value + " ");
        System.out.println();
    }

    static void printArguments(boolean... arrayArguments) {
        System.out.print("void PrintArguments(boolean... arrayArguments) " + "Колличество аргументов переменной: " + arrayArguments.length + " Содержимое: "  );
        for(boolean value : arrayArguments)
            System.out.print(value + " ");
        System.out.println();
    }

    static void printArguments(String message, int... arrayArguments) {
        System.out.print("void PrintArguments(String message, int... arrayArguments) " + message + arrayArguments.length + " Содержимое: "  );
        for(int value : arrayArguments)
            System.out.print(value + " ");
        System.out.println();
    }

    static void printArguments(int oneArgument) {
        System.out.println("void PrintArguments(int oneArgument) " + " Содержимое: " + oneArgument);
    }

    public static void main(String[] args) {
        printArguments(12, 345, -43, 43, 7);
        printArguments("Проверочное сообщение:", 12, 45, -1);
        printArguments(true, false, true, true, false);
        printArguments(13);
    }

}
