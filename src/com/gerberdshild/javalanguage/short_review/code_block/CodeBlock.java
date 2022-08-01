package com.gerberdshild.javalanguage.short_review.code_block;

//Применение блоков кода
public class CodeBlock {
    public static void main(String[] args) {
        int y;
        y = 20;
        for (int x = 0; x < 10; x++) {
            System.out.println("x = " + x + " y = " + y);
            y = y - 2;
        }
    }
}
