package com.gerberdshild.javalanguage.detailedlookatclasses.part_18;

//Вывести все аргументы командной строки.
//Для теста программы, находясь в дирректории где лежит код CommandLine, набираем
//java CommandLine this is a test arguments command line 100 - 36
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "] = " + args[i]);
    }
}
