package com.gerberdshild.javalanguage.packagesandinterfaces.part_10;

class MyClass implements B {

    @Override
    public void method1() {
        System.out.println("Реализация метода method1() из интерфейса A.");
    }

    @Override
    public void method2() {
        System.out.println("Реализация метода method2() из интерфейса A.");
    }

    @Override
    public void method3() {
        System.out.println("Реализация метода method3() из интерфейса B.");
    }
}
