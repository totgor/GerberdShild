package com.gerberdshild.javalanguage.packages_and_interfaces.part_05;

//Доступ к реализациям интерфейса через ссылки на интерфейсы.
public class TestInterface {
    public static void main(String[] args) {
        Callback ptrCallback = new Client(); //ссылка имеющая тип интерфейса Callback, тперь ссылается на объект Client, реализующая этот интерфейс
        OtherClient otherClient = new OtherClient(); //создаем экземпляр класса OtherClient, который тоже реализует интерфейс Callback
        ptrCallback.callback(45); //По ссылке имеющей тип интерфейса Callback  вызываем метод callback() реализованный в объекте new Сlient()
        //ptrCallback.noInterfaceMethod(); //У ссылки на объект реализующий интерфейс, доступ только к методам присутствующим в интерфейсе
        ptrCallback = otherClient; //Ссылке имеющей тип интерфейса Callback, присваивваем экземпляр класса OtherClient, реализующий интерфейс Callback
        ptrCallback.callback(45); //По ссылке имеющей тип интерфейса Callback вызываем метод callback() теперь реализованный в объекте OtherClient()
    }
}
