package com.gerberdshild.javalanguage.inheriting.part_06;

//Использование ключевого слова super, когда имена суперкласса и подкласса совпадают.
class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void printAiBi() {
        System.out.println("Значение i в суперклассе = " + super.i);
        System.out.println("Значение i в подлкассе = " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B myB = new B(1, 2);
        myB.printAiBi();
    }
}
