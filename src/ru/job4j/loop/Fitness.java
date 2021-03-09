package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nikol) {
        int month = 0;
        while (ivan < nikol) {
        ivan *= 3;
        nikol *= 2;
        month ++;
        }
        return month;
    }
}
