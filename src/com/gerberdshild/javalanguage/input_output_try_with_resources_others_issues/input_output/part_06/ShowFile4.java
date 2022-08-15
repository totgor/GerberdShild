package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.input_output.part_06;

import java.io.*;

//Можно сократить код вывода файла, т.к. FileNotFoundException подкласс IOException.
public class ShowFile4 {
    public static void main(String[] args) {
        int charCode;
        FileInputStream fis = null; //закрываем файл, только если он был открыт.

        if (args.length != 1) {
            System.out.println("Введено не корректное имя файла.");
            System.out.println("Сигнатура работы программы: java ShowFile имя_файла");
            return;
        }

        try {
            fis = new FileInputStream(args[0]);

            do {
                charCode = fis.read();
                if (charCode != -1) System.out.print((char)charCode);
            } while (charCode != -1);        
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода: " + e);
        } finally {
            try {
                if (fis != null) fis.close(); //закрываем файл, только если он был открыт.
            } catch(IOException e) {
                System.out.println("Ошибка закрытия файла.");
            }
        }

    }
}
