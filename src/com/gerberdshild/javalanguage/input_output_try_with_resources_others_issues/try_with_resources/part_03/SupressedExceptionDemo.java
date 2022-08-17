package com.gerberdshild.javalanguage.input_output_try_with_resources_others_issues.try_with_resources.part_03;

//Пример подавленного исключения в try() с ресурсами.
public class SupressedExceptionDemo implements AutoCloseable {
    // метод генерирует исключение RuntimeException
    public void doSomething() throws Exception {
        throw new RuntimeException("Генерируем главное исключение в методе doSomething().");
    }

    //Переопределённый метод close() интерфейса AutoCloseable
    @Override
    public void close() throws Exception {
        throw new ArithmeticException("Это подавленное исключение ArithmeticException()");
    }

    public static void main(String[] arguments) {        
        try (SupressedExceptionDemo resource = new SupressedExceptionDemo()) {
            resource.doSomething();
        } catch (Exception e) {
            System.out.println("Исключение: " + e.toString());
            //Выводим подавленные исключения
            for (Throwable exception : e.getSuppressed()) {
                System.out.println("Подавленное исключение: " + exception);
            }
        }
    }

}