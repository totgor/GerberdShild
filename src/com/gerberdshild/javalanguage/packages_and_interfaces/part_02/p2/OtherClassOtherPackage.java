package com.gerberdshild.javalanguage.packages_and_interfaces.part_02.p2;

//Другой класс в другом пакете
public class OtherClassOtherPackage {
    OtherClassOtherPackage() {
        com.gerberdshild.javalanguage.packages_and_interfaces.part_02.p1.SuperClass superClass = new com.gerberdshild.javalanguage.packages_and_interfaces.part_02.p1.SuperClass();
        System.out.println("Другой класс в другом пакете:");
        //System.out.println("n = " + superClass.n); //Не доступно! Доступно только для данного класса или пакета.
        //System.out.println("n_private = " + superClass.n_private); //Не доступно! Доступно только для данного класса.
        //System.out.println("n_protected = " + superClass.n_protected); //Не доступно! Доступно только для данного класса, подкласса или пакета.
        System.out.println("n_public = " + superClass.n_public);
    }

}
