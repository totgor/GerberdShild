package com.gerberdshild.javalanguage.packagesandinterfaces.part_02.p1;

import javax.print.attribute.standard.MediaSize;

//Классы с демонстрацией использования модификаторов доступа, когда все классы относятся к одному протсранству имён пакета p1.
public class DemoForP1 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        DerivedSuperClass derivedSuperClass = new DerivedSuperClass();
        OtherClassSamePackage otherClassSamePackage = new OtherClassSamePackage();
    }
}
