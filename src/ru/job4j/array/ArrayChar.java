package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[0 + index] == word[0 + index]) {
                 result = true;
            } else {
                 result = false;
                 break;
            }
        }
        return result;
    }
}
