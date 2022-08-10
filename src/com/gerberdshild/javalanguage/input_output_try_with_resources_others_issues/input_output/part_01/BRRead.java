package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.input_output.part_01;

import java.io.*;;

//Чтение по символу через буферризированный считыватель.
public class BRRead {
    public static void main(String[] args) throws IOException {
        char ch;
        // Создаем буферизированный считыватель, у которого есть метод read() читающий по одному символу
        // В констурктор буферезированного считывателя подаем InputStreamReader, преобразующий байты в символы
        // В констурктор InputStreamReader подаём стандартный поток ввода System.in
        // Полуичли экземпляр буферизированного считывателя br содержащего поток ввода символов, связанный с консолью через стандартный поток ввода System.in 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сиволы, 'q' для выхода:");
        do {
            ch = (char) br.read();
            System.out.println(ch);
        }while (ch != 'q');
    }
}
