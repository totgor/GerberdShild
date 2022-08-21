package com.gerberdshild.javalanguage.generics.part_03;

//Пример обобщение с несколькими параметризированными типами
class ThreeGeneric<T, V, X> {
    T obj1;
    V obj2;
    X obj3;

    ThreeGeneric(T obj1, V obj2, X obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    //показать типы T, V, X.
    void showTypes() {
        System.out.println("Значение типа T: " + obj1.getClass().getName());
        System.out.println("Значение типа V: " + obj2.getClass().getName());
        System.out.println("Значение типа X: " + obj3.getClass().getName());
    }

    T getObj1() {
        return obj1;
    }

    V getObj2() {
        return obj2;
    }

    X getObj3() {
        return obj3;
    }

}

public class ThreeGenericDemo {
    public static void main(String[] args) {
        ThreeGeneric<Integer, String, Double> obj = new ThreeGeneric<Integer, String, Double>(777,"Тестовое обобщение.", 23.412);
        obj.showTypes();
        //Получить и показать значения.
        int value = (Integer) obj.getObj1();
        System.out.println("Значение value = " + value);
        String str = (String) obj.getObj2();
        System.out.println("Значение str = " + str);
        Double d = (Double) obj.getObj3();
        System.out.println("Значение d = " + d);
    }

}
