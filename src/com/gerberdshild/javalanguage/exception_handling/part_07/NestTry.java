package com.gerberdshild.javalanguage.exception_handling.part_07;

//Пример вложенных операторов try.
public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            //Если аргументов нет, то в следующей строке будет сгенерированно исключение деление на ноль.
            int b = 7 / a;
            try {
                //Если аргумент равен 1, то в следующей строке будет сгенерированно исключение деление на ноль.
                if (a == 1) a = a / (a - a);
                //Если аргумент равен двум, то в следующей строке будет сгенерированноисключение выход за пределы массива.
                if (a == 2) {
                    int[] c = {1};
                    //выход за пределы массива.
                    c[23] = 7;
                }
            }catch (IndexOutOfBoundsException e) {
                System.out.println("Выход за пределы индекса массива.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        }
        System.out.println("Оператор за пределами блоков try/catch.");
    }
}
