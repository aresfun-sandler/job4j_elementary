package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
        ivan *= 3;
        nik *= 2;
        month ++;
        }
        return month;
    }

    public static void main(String[] args) {
        int out = Fitness.calc(10, 100);
        System.out.println(out);
    }
}
