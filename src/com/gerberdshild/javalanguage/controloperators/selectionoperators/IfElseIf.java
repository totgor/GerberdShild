package com.gerberdshild.javalanguage.controloperators.selectionoperators;

//Конструкция if-then-else.
public class IfElseIf {
    public static void main(String[] args) {
        int month = 5; //от 0 до 11 - всего 12 месяцев
        String[] monthName = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String season;
        if (month == 11 || month == 0 || month == 1)
            season = "зиме.";
        else if (month == 2 || month == 3 || month == 4)
                season = "весне.";
        else if (month == 5 || month == 6 || month == 7)
                season = "лету.";
        else  if  (month == 8 || month == 9 || month == 10)
                season = "осени.";
        else
            season = "у вымышленному сезону, так как всего 12 месяцев в году.";

        System.out.println(((month >= 0 && month <= 11)?monthName[month]:"Этот") + " месяц относится к " + season);
    }
}
