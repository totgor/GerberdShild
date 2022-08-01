package com.gerberdshild.javalanguage.detailed_look_at_classes.part_10;

//Демонстрация модификаторов доступа private и public.
class Test {
    int a; //доступ по умолчанию - protected в пределах пакета
    public int b; //открытый доступ - везде
    private int c; //заркытый доступ - только внутри класса

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Test test = new Test();

        test.a = 10;
        test.b = 20;
        //test.c = 30; //приведет к ошибке
        test.setC(30); //установка значений с помощью метода его класса

        System.out.println("test.a = " + test.a);
        System.out.println("test.b = " + test.b);
        //System.out.println("test.с = " + test.с); //приведет к ошибке
        System.out.println("test.getC() = " + test.getC());
    }
}
