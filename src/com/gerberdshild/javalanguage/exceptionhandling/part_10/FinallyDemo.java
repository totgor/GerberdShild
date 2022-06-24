package com.gerberdshild.javalanguage.exceptionhandling.part_10;

//Пример применения оператора finally.
//Во всех трёх методах блок finally будет выполнен.
public class FinallyDemo {
    //блок кода try c генерацией исключения
    static void procA() {
        try {
            System.out.println("В теле метода procA().");
            throw new RuntimeException("Вызывали исключение.");
        } finally {
            System.out.println("Блок оператора finally в методе procA().");
        }
    }

    //блок try c возвратом управления вызвавшему коду
    static void procB() {
        try {
            System.out.println("В теле метода procB().");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB().");
        }
    }

    //Стандартный блок try
    static void procC() {
        try {
            System.out.println("В теле метода procC().");
        } finally {
            System.out.println("Блок оператора finally в методе procC().");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Перехватили исключение RuntimeException()." + e);
        }
        procB();
        procC();
    }

}
