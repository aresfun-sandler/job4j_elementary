package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int index = 0; index < left.length; index++) {
            return left[left.length - 1] == right[right.length - 1];
        }
        return result;
    }
}
