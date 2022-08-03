package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.auto_boxing.part_01;

//Пример автоупаковки (auto boxing) и автораспаковки (auto unboxing).
public class AutoBox {
    public static void main(String[] args) {
        //Пример автоупаковки auto boxing
        Integer iOb = 100;
        
        //Пример автораспаковки auto unboxing
        int i = iOb;

        System.out.println("i = " + i + "\niOb = " + iOb);
    }
}
