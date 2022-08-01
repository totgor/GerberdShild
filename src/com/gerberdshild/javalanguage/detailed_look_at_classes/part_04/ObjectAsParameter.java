package com.gerberdshild.javalanguage.detailed_look_at_classes.part_04;

//Объект в качестве параметра метода класса.
class Test {
    int a;
    int b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //Одинаковый с объектом в параметре метода
    //true если одинаковый, false если отличается
    boolean equalsTo(Test test) {
        if (a == test.a && b == test.b) return true;
        else return false;
    }
}

public class ObjectAsParameter {
    public static void main(String[] args) {
        Test myTest1 = new Test(10, 20);
        Test myTest2 = new Test(10, 20);
        Test myTest3 = new Test(-1, -1);
        System.out.println("myTest1 == myTest2: " + myTest1.equalsTo(myTest2));
        System.out.println("myTest1 == myTest3: " + myTest1.equalsTo(myTest3));
    }
}
