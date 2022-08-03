package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.auto_boxing.part_02;

//Пример автоматической упаковки и распаковки, во время передачи аргумента методу и возвращения значения из метода.
public class AutoBox2 {

    private static int method(Integer iOb) {
        return iOb;
    }

    public static void main(String[] args) {
        /* 1. Передаем значение типа int в метод method(), который принимает параметр типа Integer - поэтому проиходит автоупаковка.
         * 2. Метод method() возваращет значение типа int - поэтому происходит автораспаковка iOb
         * 3. Возвращаемое значение типа int методом method() присваивается объекту-оболочке intObj - поэтому снова происходит автоупаковка.
         * 4. intObj передается в println, где срабатывает переопределённый метод toString класса Object - поэтому проиходит верный вывод значения intObj.
         * (вопрос, тут происходит автораспаковка перед выводом или под капотом происходит явное преобразование в методе toString() при помощи метода intValue(), а затем вывод).
         */
        Integer intObj = method(100);
        System.out.println("intObj = " + intObj);
    }
}
