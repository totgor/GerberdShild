package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.wraper.part_01;

//Пример работы с оболочками.
public class Wrap {
    public static void main(String[] args) {
        //c JDK9 не рекомендуется использовать конструкторы классов-оболочек
        Integer iOb = new Integer(100);
        
        //рекомендуется использовать метод valueOf()
        Integer iOb2 = Integer.valueOf(200);
        System.out.println("iOb2 = " + iOb2);

        int i = iOb.intValue();
        System.out.println("i = " + i + "\niOb = " + iOb);

    }    
}
