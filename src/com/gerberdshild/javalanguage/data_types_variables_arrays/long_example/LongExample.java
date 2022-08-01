package com.gerberdshild.javalanguage.data_types_variables_arrays.long_example;

public class LongExample {
    public static void main(String[] args) {
        int lightspeed = 186000; //скорость света (миль/сек)
        long days = 1000; //колличество дней
        long seconds = days * 24 * 60 * 60; //преобразуем дни в (сек)
        long distance = lightspeed * seconds; //вычисляем растояние, которое проходит свет за seconds - время при скорости lightspeed
        System.out.println("За " + days + " дней свет преодолеет растояние около " + distance + " миль.");
    }
}
