package com.gerberdshild.javalanguage.packages_and_interfaces.part_01; //это имя пакета

//Простой пример пакета.
class Balance {
    String name;
    Double money;

    Balance(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    void show() {
        if (money < 0) System.out.println("-->");
        System.out.println(name + ": \u20BD " + money);
    }
}
public class AccountBalance {
    public static void main(String[] args) {
        Balance[] people = new Balance[3];
        people[0] = new Balance("Петров В. А.", 457.25);
        people[1] = new Balance("Владимиров В.Ф.", 812.24);
        people[2] = new Balance("Гагарин А.А.", 85.14);
        for(int i = 0; i < 3; i++) people[i].show();
    }
}
