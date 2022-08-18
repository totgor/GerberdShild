package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.others_issues.part_02;

//Пример применения ключевого слова assert с вычислениями внутри assert утверждения.
public class AssertDemo2 {
    static int value = 3;

    static int getValue() {
        return value--;
    }

    public static void main(String[] args) {
        int n = 0;

        for (int i = 0; i < 10; i++) {
            assert((n = getValue()) > 0):"n отрицательное!"; //без ключа -ea оператор не будет выполнен! getValue() не будет выполнено в продакшене.
            System.out.println("n = " + n);
        }
    }
}
