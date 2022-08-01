package com.gerberdshild.javalanguage.exception_handling.part_01;

//Пример необрабатываемого исключения.
//Пример исключения сгенерированного делением на ноль.
//Исключение должно быть перехвачено обработчиком исключений.
//В данном примере обработчик отсутствует, поэтому исключение перехватывается стандартным обработчиком.
public class Exception0 {
    public static void main(String[] args) {
        int d = 0;
        int a = 7 / d;
    }
}
