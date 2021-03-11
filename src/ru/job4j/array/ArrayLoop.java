package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] names = new int[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = i * 2 + 3;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
