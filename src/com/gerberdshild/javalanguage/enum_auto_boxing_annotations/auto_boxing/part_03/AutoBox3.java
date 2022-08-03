package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.auto_boxing.part_03;

//Автоупаковка и автораспаковка в выражениях.
public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb1, iOb2;

        iOb1 = 100;
        System.out.println("Исходное значение iOb = " + iOb1);
        
        //iOb1 автоматически распаковывается значение увеличивается и упаковывается обратно.
        //раньше написали бы так:  iOb1 = new Integer(iOb1.intValue() + 1);
        iOb1++;
        System.out.println("После iOb++ = " + iOb1);

        //iOb1 распаковывается, выражение вычисляется и заново упаковывается.
        iOb2 = iOb1 + (iOb1 / 3);
        System.out.println("Значение выражения iOb2 = iOb1 + (iOb1 / 3) : " + iOb2);

        //значение iOb1 распаковывается, выражение вычисляется, но результат не упаковывается.
        int i = iOb1 + (iOb1 / 3);
        System.out.println("Значение выражения int i = iOb1 + (iOb1 / 3) : " + i);

    }
}
