package com.gerberdshild.javalanguage.controloperators.loopoperators;

//Используя конструкцию do-while реализуем меню выбора.
public class Menu {

    public static void HelpOut(char choice) {
        System.out.println();

        switch (choice) {
            case '1':
                System.out.println("if (условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("switch (выражение) {");
                System.out.println("    case константа1:");
                System.out.println("        оператор;");
                System.out.println("        break;");
                System.out.println("    case константа2:");
                System.out.println("        оператор;");
                System.out.println("        break;");
                System.out.println("    //...");
                System.out.println("    default:");
                System.out.println("        оператор;");
                System.out.println("        break;");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while (условие) {");
                System.out.println("    оператор;");
                System.out.println("}");
                break;
            case '4':
                System.out.println("do {");
                System.out.println("    оператор;");
                System.out.println("} while (условие);");
                break;
            case '5':
                System.out.println("for (инициализаяци; проверка условия; итерация) {");
                System.out.println("    оператор;");
                System.out.println("}");
                break;
        }

        System.out.println();
    }

    public static void main(String[] args) throws java.io.IOException {
        char choice;
        do {
            System.out.println("Справка по оператору:");
            System.out.println("    0. exit");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for");
            choice = (char) System.in.read();
            System.in.skip(100); //по факту надо было бы прочитать лишь один первый символ
            System.out.println("Вы ввели: " + choice);
            if (choice >= '1' || choice <= '5')HelpOut(choice);
        } while (choice != '0');
    }
}
