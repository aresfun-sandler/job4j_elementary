package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean thatmore = left > right;
        boolean notequal = left != right;
        return thatmore ? left : notequal ? right;
    }

    public static void main(String[] args) {
        Max.max(3,8);
    }
}
