package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.auto_boxing.part_04;

//После распоковки классов оболочек, действуют правила автоматического преобразования типов в выражениях. 
public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.2;
        dOb = dOb + iOb;
        System.out.println("dOb = dOb + iOb = " + dOb);
    }
}
