package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.others_issues.part_02;

//Пример применения ключевого слова assert.
//Для того чтобы утверждение assert сработало, необходимо в командоной строке использовать -ea:
//java -ea AssertDemo
public class AssertDemo {
    static int value = 3;

    static int getValue() {
        return value--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getValue();
            assert (n > 0): "n отрицательное!"; //будет сгенерированно исключение AssertionError, елси n = 0
            System.out.println("n = " + n);
        }        
    }
}
