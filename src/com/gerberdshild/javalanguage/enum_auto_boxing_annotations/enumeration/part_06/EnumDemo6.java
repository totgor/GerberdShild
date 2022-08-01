package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.enumeration.part_06;

//Продемонстрировать применение методов ordinal(), compareTo(), equals()
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo6 {
    public static void main(String[] args) {
        Apple ap1, ap2, ap3;

        //Вывести все порядковые значения при помощи метода ordinal()
        System.out.println("Все константы сортов яблок и их порядковые значения:" );
        for(Apple a : Apple.values())
            System.out.println(a + " : " + a.ordinal());
        
        ap1 = Apple.Winesap;
        ap2 = Apple.RedDel;
        ap3 = Apple.Winesap;

        //Продемонстрировать применение методов compareTo() и equals()
        if(ap1.compareTo(ap2) < 0) System.out.println(ap1 + " предшествует " + ap2);
        if(ap1.compareTo(ap2) > 0) System.out.println(ap2 + " предшествует " + ap1);
        if(ap1.compareTo(ap3) == 0) System.out.println(ap1 + " равен " + ap3);
        System.out.println();

        if(ap1.equals(ap2)) System.out.println("Эти значения ссылаются на разные объекты перечисления! Ошибка!");
        if(ap1.equals(ap3)) System.out.println(ap1 + " равен " + ap3 + ". В данном случае ссылаются на одну и ту же константу, т.к. сравниваются адреса ссылок.");
        if(ap1 == ap3) System.out.println(ap1 + " == " + ap3 + ". В данном случае сравниваются значения ссылок.");
        if(ap1 == ap2) System.out.println(ap1 + " != " + ap3 + ". В данном случае сравниваются значения ссылок.");

    }
}
