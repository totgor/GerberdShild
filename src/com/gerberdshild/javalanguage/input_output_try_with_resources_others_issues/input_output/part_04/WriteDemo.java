package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.input_output.part_04;

//Продемонстрировать применение метода System.out.write().
public class WriteDemo {
    public static void main(String[] args) {
        int b;
        b = 'A';
        System.out.write(b);
        b = 'B';
        System.out.write(b);
        b = '\n';
        System.out.write(b);
    }
}
