package com.gerberdshild.javalanguage.packagesandinterfaces.part_02.p1;

//Производный класс в том же пакете.
class DerivedSuperClass extends SuperClass {
    DerivedSuperClass() {
        System.out.println("Производный класс в том же пакте:");
        System.out.println("n = " + n);
        //System.out.println("n_private = " + n_private); //досутпно только для суперкласса
        System.out.println("n_protected = " + n_protected);
        System.out.println("n_public = " + n_public);
    }
}
