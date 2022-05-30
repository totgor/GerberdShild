package com.gerberdshild.javalanguage.inheriting.part_02;

//Доступ к private полю суперкласса.
class A {
    int i;
    private int j;

    void set_ij(int i, int j) {
        this.i = i;
        this.j = j;
    }

    int get_j() {
        return j;
    }
}

class B extends A {
    int total;

    void sum_ij() {
        //total = i + j; //ошибка, j в этом классе недоступен.
        total = i + get_j(); //доступ через get
    }
}

public class AccessToPrivateField {
    public static void main(String[] args) {
        B myObjectB = new B();
        myObjectB.set_ij(6, 7);
        myObjectB.sum_ij();
        System.out.println("i + j = " + myObjectB.total);
    }
}
