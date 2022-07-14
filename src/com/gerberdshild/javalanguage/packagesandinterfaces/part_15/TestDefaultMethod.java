package com.gerberdshild.javalanguage.packagesandinterfaces.part_15;

class ImplementsBeta implements Beta {
     public void method() {
         //System.out.println("Переопределенный метод method() в классе ImplementsBeta.");
         Beta.super.method();
     }
}

public class TestDefaultMethod {
    public static void main(String[] args) {
        ImplementsBeta implementsBeta = new ImplementsBeta();
        implementsBeta.method();
        
    }
}