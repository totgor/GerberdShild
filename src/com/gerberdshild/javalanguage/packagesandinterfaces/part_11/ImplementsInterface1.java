package com.gerberdshild.javalanguage.packagesandinterfaces.part_11;

public class ImplementsInterface1 implements InterfaceWithDefaultMethod {
    //В классе обязательно должен быть реализован только этот метод.
    @Override
    public int getNumber() {
        return 100;
    }
}
