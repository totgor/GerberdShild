package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.input_output.part_07;

import java.io.*;

//Копирование файла. Для копированияс: java CopyFile имя_файла_откуда имя_файла_куда.
public class CopyFile {
    public static void main(String[] args) {
        int charCode;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        if(args.length != 2) {
            System.out.println("Введены не корректные имена файлов для копирования.");
            System.out.println("Сигнатура работы программы для копированияс: java CopyFile имя_файла_откуда имя_файла_куда.");
            return;
        }

        try {
            fis = new FileInputStream(args[0]);
            fos = new FileOutputStream(args[1]);

            do {
                
                charCode = fis.read();
                if (charCode != -1) fos.write(charCode);
            } while (charCode != -1);

        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода: " + e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла \"откуда\"");
            }

            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла \"куда\"");
            }
        }
    }
}
