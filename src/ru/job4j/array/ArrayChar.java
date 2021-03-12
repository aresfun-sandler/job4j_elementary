package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[0] == word[0] && pref[1] == word[1]) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
