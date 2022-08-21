package com.gerberdshild.javalanguage.generics.part_01;

//Простой обобщенный класс.
//T - это параметр типа, который будет заменен реальным типом.
class Generic<T> {
    T object;

    //Передаем констурктору ссылку на объект типа T
    Generic(T object) {
        this.object = object;
    }

    //Возвратить объект типа T
    T getObject() {
        return object;
    }

    //показать тип T
    void showType() {
        System.out.println("T является типом: " + object.getClass().getName());
    }
}

public class GenericDemo {
    public static void main(String[] args) {        
        //Создать объект типа Generic<Integer> и присвоить ссылку на него переменной intObj. 
        //Применяется автоупаковка для инкапсуляуии значения 88 в объекте типа Integer.
        Generic<Integer> intObj = new Generic<Integer>(777); 
        //Показать типа данных хранящийся в переменной intObj
        intObj.showType();
        //Получить значение переменной intObj, приведение типов не требуется.
        int value = intObj.getObject();        
        System.out.println("Значение value = " + value);
        System.out.println();

        //Создать объект типа Generic<String> для строкового типа
        Generic<String> stringObj = new Generic<String>("Значение переменной обобщения.");
        //Показать типа данных хранящийся в переменной stringObj
        stringObj.showType();
        //Получить значение переменно stringObj. Приведение типов не требуется.
        String str = stringObj.getObject();
        System.out.println("Значение str = " + str);
    }
}
