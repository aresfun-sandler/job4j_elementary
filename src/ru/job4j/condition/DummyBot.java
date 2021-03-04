package ru.job4j.condition;

public class DummyBot {

    public static void main(String[] args) {
        String out = DummyBot.answer("Привет, бот");
        System.out.println(out);
        out = DummyBot.answer("Пока, бот");
        System.out.println(out);
        out = DummyBot.answer("Помощь");
        System.out.println(out);
    }

    public static String answer(String question) {
       String out = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (question.equals("Привет, бот")) {
           out = "Привет, умник.";
        } else if (question.equals("Пока, бот")) {
            out = "До скорой встречи!";
        }
        return out;
    }
}