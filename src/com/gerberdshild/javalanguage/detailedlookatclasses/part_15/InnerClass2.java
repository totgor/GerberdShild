package com.gerberdshild.javalanguage.detailedlookatclasses.part_15;

//Обращение к полю внутреннего класса из внешнего класса.
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.printOuter_X();
    }

    class Inner {
        int inner_y = 200;

        void printOuter_X() {
            System.out.println("outer_x = " + outer_x);
        }
    }

    void printInner_Y() {
        //System.out.println("inner_y" + inner_y); //ошибка, переменная внутреннего класса не доступна!
    }

}

public class InnerClass2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
