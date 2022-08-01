package com.gerberdshild.javalanguage.detailed_look_at_classes.part_17;

//Продемонстрировать применение масиива строк String.
public class StringDemo3 {
    public static void main(String[] args) {
        String[] stringArray = {"один", "два", "три"};
        for (int i = 0; i < 3; i++) {
            System.out.println("stringArray[" + i + "] = " + stringArray[i]);
        }
    }
}
