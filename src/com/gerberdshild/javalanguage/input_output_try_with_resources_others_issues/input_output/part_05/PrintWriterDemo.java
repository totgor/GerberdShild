package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.input_output.part_05;

import java.io.*;

//Продемонстрировать применение класса PrintWriter.
public class PrintWriterDemo {
    public static void main(String[] args) {
        //второй параметр говорит о том надо ли автоматически добавлять в OutputStream данные
        //переводится как автоматическая очистка, и так же туториалах
        PrintWriter pw = new PrintWriter(System.out, true); 
        pw.println("This string.");
        int i = -7;
        pw.println(i);
        double d = 4.3e-7;
        pw.println(d);
    }
}
