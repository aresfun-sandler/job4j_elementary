package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "job4j01";
        names[1] = "job4j02";
        names[2] = "job4j03";
        names[3] = "job4j04";
        for (String i : names) {
            System.out.println(i);
        }
    }
}
