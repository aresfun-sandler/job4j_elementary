package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = first;
        } else if (second > first && second > third) {
            result = second;
        } else if (third > first && third > second) {
            result = third;
        } else if (first == second && second == third) {
            result = first;
        } else if (first == second && first != third) {
            return first;
        } else if (first != second && first == third) {
            result = first;
        } else if (second == third && second != first) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        int out = ThreeMax.max(4, 7, 7);
        System.out.println(out);
    }
}
