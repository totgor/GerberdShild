package com.gerberdshild.javalanguage.lambda.part_11.version2;

//Для простоты я бы переписал его так!
interface CompareHighTemp {
    boolean function(HighTemp highTemp1, HighTemp highTemp2);
}

class HighTemp {
    private int temperature;

    HighTemp(int temperature) {
        this.temperature = temperature;
    }

    // Если температуры объектов равны, то true.
    boolean sameTemperature(HighTemp obj) {
        return temperature == obj.temperature;
    }

    // Если температура вызывающего объекта, ниже температуры объекта, передаваемого в качестве параметра, то true
    boolean lessThenTemperature(HighTemp obj) {
        return temperature < obj.temperature;
    }
}

public class MethodRef {
    public static void main(String[] args) {
        HighTemp sunday = new HighTemp(10);
        HighTemp monday = new HighTemp(10);
        HighTemp tuesday = new HighTemp(15);

        // В этой строке ищется метод sameTemp(), он не static, неявно boolean sameTemperature(HighTemp obj) становится boolean sameTemperature(HighTemp x, HighTemp obj), сигантура совпадает с CompareHighTemp интерфейсом.
        // HighTemp::sameTemperature - ссылка на метод произвольного объекта определённого типа.
        CompareHighTemp refCompareHighTemp = HighTemp::sameTemperature;
        // В этой строке refCompareHighTemp.function(sunday, monday) sanday выносится за скобки, становится sunday.sameTemperature(monday). sunday - произвольный объект определённого типа
        if (refCompareHighTemp.function(sunday, monday)) System.out.println("Температуры в воскресенье и понедельник  были одинакоывми.");
        
        refCompareHighTemp = HighTemp::lessThenTemperature;
        if (refCompareHighTemp.function(sunday, tuesday)) System.out.println("Температура в воскресенье была ниже, чем во вторник. ");
        
    }
}


