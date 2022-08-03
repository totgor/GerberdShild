package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.auto_boxing.part_05;

//Автоупаковка и автораспаковка позволяет управлять оператором switch().
public class AutoBox5 {
    public static void main(String[] args) {
        Integer iOb = 2;

        switch (iOb) {
            case 1:
                System.out.println("Один.");
                break;
            case 2:
                System.out.println("Два.");
                break;
            default:
                System.out.println("Ошибка!");
        }
    }
}
