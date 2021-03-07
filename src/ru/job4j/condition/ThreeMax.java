package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = 2;
        if (first >= second && first > third) {
            result = first;
        }
        if (second > first && second >= third) {
            result = second;
        }
        if (third > second && third >= first) {
            result = third;
        }
        if (first == second && second == third) {
            result = first;
        }
        return result;
    }

    public static void main(String[] args) {
        int out = ThreeMax.max(4, 4, 3);
        System.out.println(out);
    }
}
