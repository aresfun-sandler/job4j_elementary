package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 != x2 || y1 != y2) {
            int poX = Math.abs(x2 - x1);
            int poY = Math.abs(y2 - y1);
            rsl = poX + poY;
            rsl = poX != 0 && poY != 0 ? poX : rsl;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int out = ChessBoard.way(1, 0, 7, 6);
        System.out.println(out);
    }
}