package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.others_issues.part_04;

//Нет вызова перегружаемых конструкторов по ссылке this().
public class NoOverloadThis {
    int a;
    int b;

    NoOverloadThis(int a, int b) {
        this.a = a;
        this.b = b;        
    }

    NoOverloadThis(int value) {
        a = b = value;
    }

    NoOverloadThis() {
        a = b = 0;
    }
    
    public static void main(String[] args) {
        NoOverloadThis obj1 = new NoOverloadThis(1, 2);
        System.out.println("a = " + obj1.a + " b = " + obj1.b);
        System.out.println();

        NoOverloadThis obj2 = new NoOverloadThis(3);
        System.out.println("a = " + obj2.a + " b = " + obj2.b);
        System.out.println();

        NoOverloadThis obj3 = new NoOverloadThis();
        System.out.println("a = " + obj3.a + " b = " + obj3.b);

    }
}
