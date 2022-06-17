package com.gerberdshild.javalanguage.packagesandinterfaces.part_07;

//Пример использования вложенного интерфейса.
class A {
    //т.к. класс A, B, NestedInterfaceDemo в одном пакете, то public не обязателен
    public interface NestedInterface { //внутренний интерфейс (в прочем как и класс) может быть объявлен с модификаторами доступа private, public, protected и по умолчанию, т.к. он член класса
        boolean isNotNegative(int value);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isNotNegative(int value) {
        return value < 0 ? false : true;
    }
}

public class NestedInterfaceDemo {
    public static void main(String[] args) {
        A.NestedInterface ptrNestedInterface = new B(); //создаем ссылку на вложенный в класс A интерфейс и присваиваем ему вновь созданный объет B, который реализует этот интерфейс
        if(ptrNestedInterface.isNotNegative(10))
            System.out.println("Число 10, не является отрицательным? Да это так!");
        if(ptrNestedInterface.isNotNegative(-15))
            System.out.println("Число -15, не является не отрицательным? нет это не так, оно отрицательное! Поэтмоу эта строка не выведится! ");
    }
}
