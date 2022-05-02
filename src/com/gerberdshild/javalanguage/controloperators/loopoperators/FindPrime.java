package com.gerberdshild.javalanguage.controloperators.loopoperators;

//Проверить, является ли число простым.
public class FindPrime {
    public static void main(String[] args) {
        int num = 937;
        boolean isPrime;

        if (num < 2) isPrime = false;
        else isPrime = true;

        //ищем делители с 2-ки (просмотреть надо корень квадратный из num возможных делителей)
        //от i=2 до i <= num/i - приближаемся к корню квадратному из num
        for (int i = 2; i <= num / i; i++) {
            if((num%i)== 0) {  //если остаток от деления на число нулевой
                isPrime = false; //нашли делитель, не простое число
                break;
            }
        }

        if (isPrime == true) System.out.println(num + " простое число.");
        else System.out.println(num + " не простое число.");
    }
}
