package com.gerberdshild.javalanguage.multithreaded_programming.part_01;

//Управление главным потокм исполнения.
public class CurrentsThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); //Получить ссылку на объект главного текущего потока
        System.out.println("Текущий поток исполнения: " + t);
        t.setName("MyThread"); //переименовали поток
        System.out.println("Текущий поток после переименования: " + t);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000); //Приостановить выполнение потока на 1сек, этот метод может генерировать исключение InterruptedException
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока исполнения.");
            //Если в каком-нибудь другом потоке исполнения потребуется прервать ожидающий (Главный поток исполнения в данном случае) поток, возникнет исключение.
        }
    }
}
