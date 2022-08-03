package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.auto_boxing.part_07;

//Пример ошибки во время ручной распоковки. Ручная распоковка int как byte приводит к усечению результата.
public class AutoBox7 {
    public static void main(String[] args) {
        Integer iOb = 1000;
        //ручная распоковка int как byte приводит к усечению результата
        int i = iOb.byteValue();
        System.out.println("Неверное преобразование 1000 в :" + i);
    }
}
