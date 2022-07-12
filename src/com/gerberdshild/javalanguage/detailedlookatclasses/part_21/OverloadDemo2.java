package com.gerberdshild.javalanguage.detailedlookatclasses.part_21;

//Пример не перегружаемых методов. Хотя возвращаемый тип методов отличается, список параметров методов совпадает.
class Overload {
    void test() {
        System.out.println("Этот метод не имеет параметров.");
    }

    void test(int a) {
        System.out.println("Этот метод имеет один параметр a = " + a);
    }

    void test(int a, int b) {
        System.out.println("Этот метод имеет два параметра a = " + a + " b = " + b);
    }

    double test(double d) {        
        return d;
    }

    float test(float f) {
        return f;
    }
    
    //Для поиска перегружаемого метода важен не возвращаемый тип данных метода, а только параметры метода.
    //Поэтому этот метод - будет ошибкой синтаксиса, повтором метода void test();
    // int test() {
    //     return 10;
    // }

}

public class OverloadDemo2 {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test(10);
        overload.test(20, 30); 
        System.out.println("double test(double d) = " + overload.test(10.1d));
        System.out.println("float test(float f) = " + overload.test(20.1f));
    }
}
