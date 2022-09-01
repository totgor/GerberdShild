package com.gerberdshild.javalanguage.generics.part_16;

class Generic<T, V> {
    T ob1;
    V ob2;

    Generic(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;        
    }

    // Ошибка неоднозначности в результате стирания типов перегружаемых методов.
    void set(T ob1) {
        this.ob1 = ob1;
    }

    // void set(V ob2) {
    //     this.ob2 = ob2;
    // }
}


// Ошибка неоднозначности пропадает.
class Generic2<T, V extends Number> {
    T ob1;
    V ob2;

    Generic2(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;        
    }

    void set(T ob1) {
        this.ob1 = ob1;
    }

    void set(V ob2) {
        this.ob2 = ob2;
    }
}

public class AmbiguityGeneric {
    public static void main(String[] args) {
        // В этом случае оьба варианта метода set оказываются одинаковыми.
        Generic<String, String> obj = new Generic<String, String>("строка 1", "строка 2");

        // Но ошибка присутствует, если создать подоный экземпляр класса.
        Generic2<Number, Number> obj2 = new Generic2<Number, Number>(1, 2);
        // Какой вариант метода set() надо вызвать?
        // obj2.set(3);
        

    }

}