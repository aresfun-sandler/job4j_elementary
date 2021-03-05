package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !(num > 0);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && num > 0;
    }

    public static boolean evenOrNotPositive(int num) {
        return (num % 2 == 0) || !(num > 0);
    }

    public static void main(String[] args) {
        System.out.println("number is Even? " + LogicNot.isEven(2));
        System.out.println("number is Positive? " + LogicNot.isPositive(4));
        System.out.println("number not Even? " + LogicNot.notEven(5));
        System.out.println("number not Positive? " + LogicNot.notPositive(6));
        System.out.println("number not Even And Positive? " + LogicNot.notEvenAndPositive(7));
        System.out.println("number even Or Not Positive? " + LogicNot.evenOrNotPositive(8));
    }

}
