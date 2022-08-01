package com.gerberdshild.javalanguage.packages_and_interfaces.part_04;

//Пример реализации интерфейса.
public class TestClient {
    public static void main(String[] args) {
        Client client = new Client();
        client.callback(456);
        client.noInterfaceMethod();
    }
}
