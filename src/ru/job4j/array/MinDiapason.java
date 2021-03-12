package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] == array[finish]) {
                break;
            }
        }
        return min;
    }
}
