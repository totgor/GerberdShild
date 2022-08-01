package com.gerberdshild.javalanguage.data_types_variables_arrays.visibility_area;

//Область видимости переменных в блоке кода
public class VisibilityArea {
    public static void main(String[] args) {
        int x; //переменная доступна всему коду
        x = 10;
        if (x == 10) {
            int y = 20; //переменная доступна только этому блоку кода
            System.out.println("x = " + x + " y = " + y);
            x = y * 2;
        }

        //y = 100; //переменная не доступна
        System.out.println("x = " + x);

    }
}
