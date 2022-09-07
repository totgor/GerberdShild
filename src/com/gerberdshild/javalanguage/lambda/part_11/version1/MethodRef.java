package com.gerberdshild.javalanguage.lambda.part_11.version1;

// Передача ссылки на метод произвольного объекта определённого типа.

/* В этой строке кода вызывается метод, который принимает "ссылку на метод произвольного объекта определённого типа" - HighTemp::sameTemperature
 * int count = counter(arrayHighTemps, HighTemp::sameTemperature, new HighTemp(31));
 * 
 * Работа Java, при встрече с HighTemp::sameTemperature
 * 1. Ищет метод sameTemp в классе HighTemp.
 * 2. Определяет что этот метод не static (Если static поведение меняется.).
 * 3. В найденный метод boolean sameTemperature(HighTemp obj) неявно, в начало, добавляет параметр HighTemp x, в результате сигнатура выглядит так: boolean sameTemperature(HighTemp x, HighTemp obj).
 * 4. Теперь подправленную сигнатуру сравнивает с сигнатурой метода функционального интерфейса CompareHighTemp boolean function(T highTemp1, T highTemp2).
 * 
 * Далее когда Java встречает в методе counter(): 
 * refCompareHighTemp.function(arrayHighTemps[i], objHighTemp)
 * перед тем как его исполнить происходит следующее:
 * 5. Аргумент arrayHighTemps[i] - выносится из скобок и подставляется вместо refCompareHighTemp, становясь тем самым "произвольным объектом определённого типа".
 *    Т.е. в пункте 3 этот аргумент был неявно добавлен, а теперь он "исчезает". Другими словами, объект arrayHighTemps[i] вытянули и он(параметр) больше не нужен!
 * 6. function(objHighTemp) с одним параметром, становится sameTemperature(objHighTemp).
 * 
 * В итоге получаем, что Java исполнит это:
 *      refCompareHighTemp.function(arrayHighTemps[i], objHighTemp)
 * фактически вот так:
 *      arrayHighTemps[i].sameTemperature(objHighTemp)
 */


 //Какой же муторно сложный пример!!! 

interface CompareHighTemp<T> {
    boolean function(T highTemp1, T highTemp2);
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

    static <T> int counter(T[] arrayHighTemps, CompareHighTemp<T> refCompareHighTemp, T objHighTemp) {
        int count = 0;
        for (int i = 0; i < arrayHighTemps.length; i++) {
            if(refCompareHighTemp.function(arrayHighTemps[i], objHighTemp)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        HighTemp[] arrayHighTemps = {new HighTemp(31), new HighTemp(29), new HighTemp(30),
                                     new HighTemp(32), new HighTemp(28), new HighTemp(30),
                                     new HighTemp(31), new HighTemp(27), new HighTemp(31)};
        
        int count = counter(arrayHighTemps, HighTemp::sameTemperature, new HighTemp(31));
        System.out.println("Максимальная температура на неделе в 31 градус держалась " + count + " дней.");

        count = counter(arrayHighTemps, HighTemp::lessThenTemperature, new HighTemp(31));
        System.out.println("Максимальная температура на неделе ниже 31 градусов держалась " + count + " дней.");
    }

}


