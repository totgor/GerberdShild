package com.gerberdshild.javalanguage.control_operators.selection_operators;

//Пример усовершенственной IfElseIf с оператором switch. Определение сезона.
public class SeasonSwitch {
    public static void main(String[] args) {
        int month = 12; //от 0 до 11 - всего 12 месяцев
        String[] monthName = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String season;
        switch (month) {
            case 11:
            case 0:
            case 1:
                season = "зиме";
                break;
            case 2:
            case 3:
            case 4:
                season = "весне";
                break;
            case 5:
            case 6:
            case 7:
                season = "лету";
                break;
            case 8:
            case 9:
            case 10:
                season = "осени";
                break;
            default:
                season = "вымышленному сезону, так как всего 12 месяцев в году.";
        }
        System.out.println(((month >= 0 && month <= 11)?monthName[month]:"Этот") + " месяц относится к " + season);
    }
}
