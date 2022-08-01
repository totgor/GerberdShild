package com.gerberdshild.javalanguage.exception_handling.part_13;

//Пример многократного перехвата исключений.
public class MultiCatch {
    static void proc(int variant) {
        int a = 10, b =0, result;
        int[] array = {1, 2, 3};

        try {
            switch(variant){
                case 1:
                    result = a / b;
                    break;
                case 2:
                    array[10] = 777;
                    break;
                default:
                    System.out.println("Такого варианта не существует.");
            }
            //В этом операторе catch перехватываются оба типа исключений.
            //Каждый параметр многократного перехвата неявно считается конечным final.Поэтому новое значение ему присвоить нельзя
        } catch (ArithmeticException |
                 IndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
        System.out.println("После многократного перехвата.");
    }

    public static void main(String[] args) {
        proc(1);
        proc(2);
    }
}
