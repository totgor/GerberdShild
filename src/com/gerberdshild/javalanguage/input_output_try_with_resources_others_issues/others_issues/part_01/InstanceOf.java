package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.others_issues.part_01;

class A {
    int i, j;    
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}


//Применение операции instanceof.
public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) System.out.println("a является экземпляром класса A");
        if (b instanceof B) System.out.println("b является экземпляром класса B");
        if (c instanceof C) System.out.println("c является экземпляром класса C");
        if (d instanceof D) System.out.println("d является экземпляром класса D");
        System.out.println();

        //порожденные типы
        A ob;
        ob = c;
        System.out.println("ob ссылается на с:");
        if (ob instanceof D) System.out.println("ob можно привести к типу D");
        else System.out.println("ob нельзя привести к типу D");
        if (ob instanceof A) System.out.println("ob можно привести к типу A");
        System.out.println();

        ob = d;
        System.out.println("ob ссылается на d:");
        if (ob instanceof D) System.out.println("ob является экземпляром класса D");
        System.out.println();

        //Все объекты могут быть приведены к типу Object
        if (a instanceof Object) System.out.println("a можно привести к классу Object");
        if (b instanceof Object) System.out.println("b можно привести к классу Object");
        if (c instanceof Object) System.out.println("c можно привести к классу Object");
        if (d instanceof Object) System.out.println("d можно привести к классу Object");

    }
}
