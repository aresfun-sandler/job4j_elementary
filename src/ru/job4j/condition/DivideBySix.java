package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        if ((number % 2 == 0) && (number % 3 == 0)) {
            return "Исходное число делится на 6.";
        } else if ((number % 3 == 0) && (number % 2 != 0)) {
            return "Исходное число делится на 3, но не является четным.";
        } else if ((number % 3 != 0) && (number % 2 == 0)) {
            return "Исходное число не делится на 3, но является четным.";
        } else if ((number % 3 != 0) && (number % 2 != 0)) {
            return "Исходное число не делится на 3 и не является четным.";
        }
        return null;
    }

    public static void main(String[] args) {
        String out = DivideBySix.checkNumber(138);
        System.out.println(out);
    }
}