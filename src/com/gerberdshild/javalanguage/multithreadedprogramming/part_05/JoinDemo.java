package com.gerberdshild.javalanguage.multithreadedprogramming.part_05;

//Пример использования метода join() для ожидания завершения потоков.
public class JoinDemo {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");
        NewThread ob3 = new NewThread("Три");

        System.out.println("Поток " + ob1.name + " запущен: " + ob1.thread.isAlive());
        System.out.println("Поток " + ob2.name + " запущен: " + ob2.thread.isAlive());
        System.out.println("Поток " + ob3.name + " запущен: " + ob3.thread.isAlive());

        try{
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();            
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Поток " + ob1.name + " запущен: " + ob1.thread.isAlive());
        System.out.println("Поток " + ob2.name + " запущен: " + ob2.thread.isAlive());
        System.out.println("Поток " + ob3.name + " запущен: " + ob3.thread.isAlive());
        System.out.println("Главный поток завершён.");
    }
}
