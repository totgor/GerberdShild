package com.gerberdshild.javalanguage.exception_handling.part_11;

//Пример использования собственного класса исключения, производного от Exception.
public class MyExceptionTest {
    static void compute(int a) throws MyException {
        System.out.println("Вызов метода compute(" + a + ").");
        if (a > 10) throw new MyException(a);
        System.out.println("Нормальное завершение программы.");
    }

    public static void main(String[] args) {
        try {
            compute(10);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
