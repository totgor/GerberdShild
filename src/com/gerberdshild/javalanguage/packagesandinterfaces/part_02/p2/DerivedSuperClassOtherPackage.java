package com.gerberdshild.javalanguage.packagesandinterfaces.part_02.p2;

//Производный класс суперкласса из другого пакета.
public class DerivedSuperClassOtherPackage extends com.gerberdshild.javalanguage.packagesandinterfaces.part_02.p1.SuperClass {
    DerivedSuperClassOtherPackage() {
        System.out.println("Производный класс суперкласса из другого пакета:");
        //System.out.println("n = " + n); //Не доступно! доступно для данного класса или пакета.
        //System.out.println("n_private = " + n_private); //Не доступно! Доступно только для данного класса.
        System.out.println("n_protected = " + n_protected);
        System.out.println("n_public = " + n_public);
    }
}
