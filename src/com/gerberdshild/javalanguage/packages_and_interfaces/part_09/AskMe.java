package com.gerberdshild.javalanguage.packages_and_interfaces.part_09;

//Пример использования константных переменных в интерфесах.
class AskMe implements SharedConstants {
    //статическая функция для вывода результата рандомного числа
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позже");
                break;
            case SOON:
                System.out.println("Скоро");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        for (int i = 0; i < 10; i++) answer(question.ask());
    }
}
