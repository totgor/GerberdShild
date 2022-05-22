package com.gerberdshild.javalanguage.detailedlookatclasses.part_08;

//Возврат объекта. Путем создания копии нового при помощи своего же метода, при этом изменяя значение поля.
class Test {
    int a;

    Test(int a) {
        this.a = a;
    }

    //Возврат нового объекта, путем создания копии такого же с увеличением поля на 10.
    Test IncrementByTen() {
        Test test = new Test(a + 10);
        return  test;
    }
}

public class ReturnObject {
    public static void main(String[] args) {
        Test test1 = new Test(3);
        Test test2;
        test2 = test1.IncrementByTen(); //создали новый объект, присвоив a + 10, при этом test1.a = 3
        System.out.println("test1.a = " + test1.a); //test1 ссылается на первый объект
        System.out.println("test2.a = " + test2.a); //test2 ссылается на новый объект
        test2 = test2.IncrementByTen(); //test2 ссылается на новый объект, старый test2 утерян, его приберет c сборщик мусора, ведь на него уже никто не ссылается
        System.out.println("test2.a после второго увеличения = " + test2.a);
    }
}
