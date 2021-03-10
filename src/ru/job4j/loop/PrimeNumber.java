package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        int index = 2;
        for (int number = index; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
            count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int out = PrimeNumber.calc(31);
        System.out.println(out);
    }
}
