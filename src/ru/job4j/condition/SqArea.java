package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = (6/(2*(2 + 1)))*2*(6/(2*(2 + 1)));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result1);
    }
}