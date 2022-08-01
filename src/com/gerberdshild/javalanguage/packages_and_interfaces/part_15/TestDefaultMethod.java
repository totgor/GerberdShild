package com.gerberdshild.javalanguage.packages_and_interfaces.part_15;

//Вопросы множественного наследования.
class ImplementsBeta implements Beta {
     public void method() {
         //System.out.println("Переопределенный метод method() в классе ImplementsBeta.");
         Beta.super.method(); //Если хочу вызвать method() определенный в Beta интерфейсе
     }
}

//Сигнатуры Defaul - мтеодов в реализующих интерфесах совпадают. Ошибка синтаксиса.
// class ImplementsTwoInterface implements Alpha, Gamma {
    
// }

//1. Когда сигнатуры defaul-методов в классе реализуюшем несколько интерфесов совпадают, приоритет отдается реализации  default-метода в классе (если он в нем переопределяется).
//2. Если в классе используется два интерфейса с одинаковой реализацией default-метода и метод не переопределяется в классе, то это ошибка!
//3. Если один интерфес, наследует другой и в обоих присутствует default-метод c одинаковой реализацией, приоритет за вариантом наследующего интерфейса.
//4. Через имя_интерфейса.super.имя_default_метода можно ссылаться на реализацию по умолчанию наследуемого интерфейса.
public class TestDefaultMethod {
    public static void main(String[] args) {
        ImplementsBeta implementsBeta = new ImplementsBeta();
        implementsBeta.method();        
    }
}