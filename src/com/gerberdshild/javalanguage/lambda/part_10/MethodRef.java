package com.gerberdshild.javalanguage.lambda.part_10;

// Пример использования ссылки на метод экземпляра.

// Функциональный интерфейс для работы со строками.
interface StringFunction {
    String function(String str);    
}

// Класс с методом, который будет использоваться для реализации функционального интерфейса.
class MyClass {
    String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class MethodRef {
    // Метод для передачи ссылки на метод экземпляра класса MyClass, который совместим с функциональным интерфейсом StringFunction.
    // Правильнее для ссылки на функциональный интерфейс, в который можно передать ссылку на метод, совместимый по сигануре с функциональным интерфесом.
    static String stringOperation(StringFunction sf, String str) {
        return sf.function(str);
    }

    public static void main(String[] args) {
        String stringInput = "Push yourself, or no one will  do it for you!";        
        MyClass myClass = new MyClass();
        System.out.println("Строка stringInput до изменения: " + stringInput);
        // Используется ссылка на метод экземпляра класса, который должен быть своместим по сигнатуре с реализуемым интерфейсом.
        System.out.println("Строка stringInput после изменения: " + stringOperation(myClass::reverse, stringInput));

        // Передавать ссылку на метод экземпляра в метод stringOperation() не обязательно.
        StringFunction sf = myClass::reverse;        
        System.out.println("Строка stringInput после изменения: " + sf.function(stringInput));
    }    
}
