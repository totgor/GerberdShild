package com.gerberdshild.javalanguage.data_types_variables_arrays.life_time;

//Срок жизни переменной.
public class LifeTime {
    public static void main(String[] args) {
        int x;
        for(x = 0; x < 3; x++) {
            int y = -1; //переменная  y инициализируется при каждом вхождении в блок кода
            System.out.println("y = " + y);
            y = 100;
            System.out.println("теперь y = " + y);
            //int x = 3; //ошибка, переменная уже определена
        }
    }
}
