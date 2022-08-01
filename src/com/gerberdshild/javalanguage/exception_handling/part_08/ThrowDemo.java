package com.gerberdshild.javalanguage.exception_handling.part_08;

//Пример использования оператора throw.
public class ThrowDemo {
    static void useThrow() {
        try {
            //Создание экземпляра исключения. Используется конструктор с символьной строкой, описывающей исключение.
            //Для вывода достаточно передать объект методу print или вызвать метод getMessage() из класса Throwable.
            throw new NullPointerException("Текст для генерируемого исключения типа NullPointerException.");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода useThrow(). ");
            //Повторно сгенерировать тоже самое исключение.
            //e - ссылается на объект NullPointerException созданный ранее оператором new и сгенерированный оператором throw.
            //оператору throw можно передавать только объекты класса Throwable или унаследованные от Throwable.
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            useThrow();
        } catch (NullPointerException e) {
            System.out.println("Повторно перехватить исключение в main(). " + e);
        }
    }
}