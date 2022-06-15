package com.gerberdshild.javalanguage.packagesandinterfaces.abstractclassandinterface;

//Отличия абстрактных классов от интерфесов.
//Класс может унаследовать только один абстрактный класс. Если после MyClass1 через запятую добавить ещё один класс компилятор выругается.
//Можно реализовывать множесто интерфесов. Указываем через запятую
public class AbstractClassAndInterface extends MyClass1 implements MyInterface1, MyInterface2 {
    public static void main(String[] args) {
        System.out.println("s2 в  MyInterface1: " + MyInterface1.s2); //Можем обращаться к полям MyInterface1 до реализации интерфейса непосредственно по имени
        System.out.println("b в  MyInterface2: " + MyInterface2.b); //Для доступа к полям интерфейсов с одинаковым именем используем Имя_интерфеса.поле
        new AbstractClassAndInterface().yourAge(); //выводим стандартную реализацию интерфейса MyInterface1
        new AbstractClassAndInterface().yourName();
    }

    //ОБязательно переопределение абсрактного метода
    @Override
    void bye() {
        System.out.println("Bye!");
    }

    //обязательно переопределение метода интерфейса
    @Override
    public void yourName() {
        System.out.println("Name");
    }
}

class BaseClass {

}

interface BaseInterface {

}

//Абстрактный класс
//абстрактный класс может реализовывать другой класс и реализовывать интерфейс
abstract class MyClass1 extends BaseClass implements BaseInterface {
    String s1;
    int a;

    void hello() {
        System.out.println("Hello!");
    }

    //абстрактный метод
    abstract void bye(); //если есть хоть один абстрактный метод, то класс должен быть абстрактным
}

//Интерфейс
interface MyInterface1 {
    String s2 = "Строка"; //Надо обязательно инициализировать. Неявно поле становится public final static
    int b = 15; //Надо обязательно инициализировать. Неявно поле становится public final static

    void yourName();

    //метод по умолчанию, его реализация необходимо уже в интерфейсе
    //этот метод будет во всех реализующих классах
    default void yourAge() {
        System.out.println(18);
    }

}

//Можно расширять интерфейсы за счёт других интерфесов
interface MyInterface2 extends MyInterface1 {
    String s2 = "Строк2";
    int b = 13;
}