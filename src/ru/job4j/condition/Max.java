package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int more = left > right ? left : right;
        return more;
    }

    public static void main(String[] args) {
        int result = Max.max(7, 3);
        System.out.println(result);
    }
}
