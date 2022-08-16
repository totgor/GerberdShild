package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.input_output.part_06;

import java.io.*;

//Пример вывода содержимого файла в консоль.
public class ShowFile {
    public static void main(String[] args) {
        int charCode; //для метод read()
        FileInputStream fis;
        
        //проверка корректности имени файла
        if(args.length != 1) {
            System.out.println("Введено не корректное имя файла.");
            System.out.println("Сигнатура работы программы: java ShowFile имя_файла");
            return;
        }

        //Попытка открыть файл
        try {
            fis = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            return;
        }

        //Вывод данных из файла
        try {
            do {
                charCode = fis.read();
                if (charCode != -1) System.out.print((char)charCode);
            } while (charCode != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла.");
        }

        //Попытка закрыть файл
        try {
            fis.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла.");
        }
    }    
}
