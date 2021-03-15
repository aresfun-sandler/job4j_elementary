package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int nullIndex = i;
                for (int j = array.length - 1; j != i; j--) {
                    if (array[j] != null) {
                        int notNullIndex = j;
                        String temp = array[notNullIndex];
                        array[notNullIndex] = array[nullIndex];
                        array[nullIndex] = temp;
                    }
                  }
                }
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
