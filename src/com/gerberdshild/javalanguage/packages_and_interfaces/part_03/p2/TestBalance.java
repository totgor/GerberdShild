package com.gerberdshild.javalanguage.packages_and_interfaces.part_03.p2;

import com.gerberdshild.javalanguage.packages_and_interfaces.part_03.p1.*;

//Пример импорта классов пакета.
public class TestBalance {
    public static void main(String[] args) {
        Balance people = new Balance("Иванов С.П.", 425.23);
        people.show();
    }
}
