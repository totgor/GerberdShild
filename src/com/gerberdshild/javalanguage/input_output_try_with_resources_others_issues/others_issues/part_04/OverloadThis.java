package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.others_issues.part_04;

//Вызов перегружаемых конструкторов по ссылке this().
public class OverloadThis {
    int a;
    int b;
    
    OverloadThis(int a, int b) {
        this.a = a;
        this.b = b;
    }

    OverloadThis(int value) {
        this(value, value); //this() должен стоять первым оператором в констуркторе
    }

    OverloadThis() {
        this(0); //this() не может применяться с super(), т.к. каждый из них должен быть первым в конструкторе.
    }

    public static void main(String[] args) {
        OverloadThis obj1 = new OverloadThis(1, 2);
        System.out.println("a = " + obj1.a + " b = " + obj1.b);
        System.out.println();

        OverloadThis obj2 = new OverloadThis(3);
        System.out.println("a = " + obj2.a + " b = " + obj2.b);
        System.out.println();

        OverloadThis obj3 = new OverloadThis();
        System.out.println("a = " + obj3.a + " b = " + obj3.b);
    }
}
