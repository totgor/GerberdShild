package com.gerberdshild.javalanguage.packages_and_interfaces.part_02.p1;

//Другой класс, не производный, в том же пакете.
public class OtherClassSamePackage {
    OtherClassSamePackage() {
        SuperClass superClass = new SuperClass();
        System.out.println("Другой класс, не производный от базового суперкласса, в том же пакте:");
        System.out.println("n = " + superClass.n);
        //System.out.println("n_private = " + superClass.n_private); //доступно только суперкласса
        System.out.println("n_protected = " + superClass.n_protected);
        System.out.println("n_public = " + superClass.n_public);
    }
}
