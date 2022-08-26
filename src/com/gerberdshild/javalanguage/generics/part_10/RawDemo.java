package com.gerberdshild.javalanguage.generics.part_10;

// Базов тип.
class Generic<T> {
    T value;

    Generic(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

// Применение базового (сырого) типа.
public class RawDemo {
    public static void main(String[] args) {
        Generic<Integer> int_obj = new Generic<Integer>(777);
        Generic<String> str_obj = new Generic<String>("Тест обобщения.");

        // Cоздать объект базового типа. По факту вместо параметра T передаётся тип Object.
        Generic raw = new Generic((new Double(123.4)));
        double d = (Double) raw.getValue(); // требуется приведение типа, поскольку тип не известен
        System.out.println("Значение d = " + d);

        // Применение базовых типов может вызвать исключения во время выполнения.
        // Следующее приведение может вызвать ошиюку во время выполнения.
        // int i = (Integer)raw.getValue(); //В raw.value - Double значение.

        // Следующее присваивание нарушает типовую безопасность
        // str_obj = raw; //В raw.value - Double значение. А str_obj может содержать только String.

        // После предидущей строки str_obj ссылается на объект типа Double(Object).
        // String str = str_obj.getValue(); 

        // Такое присваивание нарушает типовую безопасность.
        //raw = int_obj;
        //В raw.value - Integer значение. Поэтому ошибка.
        //d = (Double) raw.getValue();
    }
}
