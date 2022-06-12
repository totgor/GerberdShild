package com.gerberdshild.javalanguage.packagesandinterfaces.part_03.p1;

public class Balance {
    String name;
    double money;

    public Balance(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void show() {
        if (money < 0) System.out.println("-->");
        System.out.println(name + " : \u20BD" + money);
    }
}
