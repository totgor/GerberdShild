package com.gerberdshild.javalanguage.detailed_look_at_classes.part_16;

//Пример определения внутреннего класса внутри блока кода(в цикле for).
class Outer {
    int outer_x = 100;

    void test() {
        for(int i = 0; i < 10; i++) {
            class Inner {
                int inner_y = 200;

                void printOuter_X() {
                    System.out.print(" outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner(); //класс доступен только в этом блоке кода цикла for
            inner.printOuter_X();
            System.out.println(" inner_y = " + inner.inner_y); //в этом же блоке кода, поэтому могу достучаться до inner_y
        }
        //Inner inner = new Inner(); //тут уже до внутреннего класса не достучаться
    }
}

public class InnerClass3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
