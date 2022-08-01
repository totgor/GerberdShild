package com.gerberdshild.javalanguage.detailed_look_at_classes.part_14;

//Пример внутреннего класса.
//внешний класс.
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.printOuter_X();
    }

    //внутренний класс
    class Inner {
        void printOuter_X() {
            System.out.println("outer_x = " + outer_x); //внутренний класс имеет доступ к полям внешнего класса
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
