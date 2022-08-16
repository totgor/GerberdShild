package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.try_with_resources.part_01;

import java.io.*;

//Пример использования оператора try с ресурсами для автоматического закрытия файла.
public class ShowFile {
    public static void main(String[] args) {
        int charCode;

        if (args.length != 1) {
            System.out.println("Использование: java ShowFile имя_файла");
            return;
        }

        //try() - применяется для открытия, а затем автоматического закрытия файла по завершении блока оператора try()
        try (FileInputStream fis = new FileInputStream(args[0])) {

            do {
                charCode = fis.read();
                if (charCode != -1)
                    System.out.print((char) charCode);
            } while (charCode != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла.");
        }

    }
}
