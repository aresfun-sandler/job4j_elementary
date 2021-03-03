package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {

        return value / 60;
    }

    public static void main(String[] args) {
        int inEuro = 140;
        int inDollars = 120;
        int expEuro = 2;
        int expDollars = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        int outDollars = Converter.rubleToDollar(inDollars);
        boolean passedEuro = expEuro == outEuro;
        boolean passedDollars = expDollars == outDollars;
        System.out.println("140 rubles are " + outEuro + " euro. Test result: " + passedEuro);
        System.out.println("120 rubles are " + outDollars + " dollars. Test result: " + passedDollars);
    }
}
