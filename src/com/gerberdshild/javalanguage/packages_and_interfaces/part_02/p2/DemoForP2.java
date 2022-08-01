package com.gerberdshild.javalanguage.packages_and_interfaces.part_02.p2;

//Классы с демонстрацией использования модификаторов доступа, когда все классы относятся к другому протсранству имён пакета p2.
public class DemoForP2 {
    public static void main(String[] args) {
        DerivedSuperClassOtherPackage derivedSuperClassOtherPackage = new DerivedSuperClassOtherPackage();
        OtherClassOtherPackage otherClassOtherPackage = new OtherClassOtherPackage();
    }
}
