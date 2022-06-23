package com.gerberdshild.javalanguage.exceptionhandling.part_06;

//В последовательности операторов catch подкласс исключений должен быть указан перед его суперклассом. Иначе это ошибка недостижимого кода.
public class SuperAndSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 7 / a;
        }
        catch (Exception e) {
            System.out.println("Перехват исключения общего класса Exception. Исключение деление на ноль: " + e);
        }
        //Т.к. класс ArithmeticException является производным от Exception, то этот код не будет достижим.
        //Все прерывания будут отлавливаться раньше, базовым классом Exception.
        //В Java недостижимый код является ошибкой.
//        catch (ArithmeticException e) {
//            System.out.println("Этот код недостижим.");
//        }
    }
}
