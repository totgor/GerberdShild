package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.input_output.part_03;

import java.io.*;

//Простейший текстовый редактор.
public class TinyEdit {
    public static void main(String[] args) throws IOException {
        String[] str_array = new String[100];
        //создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строки теста.");
        System.out.println("Для завершения 'exit'.");

        for(int i = 0; i < 100; i++) {
            str_array[i] = br.readLine(); //Читаем построчно.
            if (str_array[i].equals("exit")) break;
        }
        for (int i = 0; i < 100; i++){
            System.out.println(str_array[i]);
            if (str_array[i].equals("exit")) break;
        }
    }
}
