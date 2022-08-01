package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.enumeration.part_04;

//Перечисление это класс. Используем конструктор, переменную и метод в перечислении.
//Перечисление не может наследоваться и быть суперклассом.
enum Apple {
    //Константы объявляются используя имеющиеся конструкторы;
    //Каждая константа - это экзмепляр класса-перечисления;
    //У каждой константы свои экземпляры полей и методов перечисления.
    Jonathan(10), GoldenDel(15), RedDel, Winesap(5), Cortland(17);

    private int price;

    Apple(int price) {
        this.price = price;
    }

    //перегружаемый конструктор, в случае отсутствия цены.
    Apple() {
        price = -1;
    }

    //метод для получения значения цена константы
    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }
}

public class EnumIsAClass {
    public static void main(String[] args) {
        Apple ap = Apple.Cortland;

        System.out.println(ap + " стоит " + ap.getPrice());
        System.out.println("Яблоко GoldenDel стоит " + Apple.GoldenDel.getPrice());

        //Если поменять значение константы Cortland, ap - лишь ссылка на Cortland;
        ap.setPrice(60);
        System.out.println(ap + " стоит " + ap.getPrice());

        System.out.println();
        System.out.println("Все константы перечисления Apple и их стоимость:");
        for(Apple a : Apple.values())
            System.out.println(a + " стоит " + a.getPrice());
        
    }    
}
