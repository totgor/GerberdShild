package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.enumeration.part_07;

//Еще один пример применения перечисления Answers.
public class TestAskMeQuestion {
    public static void main(String[] args) {
        Question question = new Question();
        for(int i = 0; i < 10; i++)
            AskMe.answer(question.ask());
    }
}
