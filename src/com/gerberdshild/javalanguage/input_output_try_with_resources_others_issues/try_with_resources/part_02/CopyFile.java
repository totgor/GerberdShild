package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.try_with_resources.part_02;

import java.io.*;

//Применение оператора try() с ресурсами, для открытия двух файлов для копирования. С автоматическим закрытием файлов.
public class CopyFile {
    public static void main(String[] args) {
        int charCode;

        if (args.length != 2) {
            System.out.println("Использование: java FileCopy файл_откула файл_куда");
            return;
        }

        //открываем через ';' два файла в операторе try() с ресурсами
        try (FileInputStream fis = new FileInputStream(args[0]);
                FileOutputStream fos = new FileOutputStream(args[1])) {

            do {
                charCode = fis.read();
                if (charCode != -1)
                    fos.write(charCode);
            } while (charCode != -1);

        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода: " + e);
        }
    }
}
