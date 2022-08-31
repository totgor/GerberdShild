package com.gerberdshild.javalanguage.generics.part_15;

// Ситуация с обобщенным классом, в которой создается мостовой метод.

// Ситуация возникает, когда результат стирания типов методе из суперкласса и перегружаемом методе из подкласса не совпадает.
// В этом случае создается метод, который использует стирание типов в суперклассе и вызывает метод из подкласса с указанным стиранием типов.  
// В нашем случае это Object getObject();
class Generic<T> {
    T object;

    Generic(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }
}

//SubGeneric расширяет класс Generic c конкретныи аргументом типа String
class SubGeneric extends Generic<String> {
    SubGeneric(String object) {
        super(object);
    }

    //Переопределение метода с конкретным возвращаемым типом String
    String getObject() {
        System.out.println("Метод String getObject():");
        return object;
    }
}



public class BridgeMethod {
    public static void main(String[] args) {
        SubGeneric subGen = new SubGeneric("Для этого метода компилятор создаст мостовой метод.");
        System.out.println(subGen.getObject());
    }
}
