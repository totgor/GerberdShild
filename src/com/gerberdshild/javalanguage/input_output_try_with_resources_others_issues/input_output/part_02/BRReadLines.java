package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.input_output.part_02;

import java.io.*;

//Чтение символьных строк с консоли средствами BufferedReader.
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            str = br.readLine(); //читаем построчно
            System.out.println(str); 
        } while (!str.equals("exit"));
    }
}
