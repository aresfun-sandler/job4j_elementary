package test;

import org.junit.Test;
import ru.job4j.condition.ChessBoard;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {
    @Test
    public void wayIs6() {
        int way = ChessBoard.way(1, 0, 7, 6);
        assertThat(way, is(6));
    }

    @Test
    public void wayIs3() {
        int way = ChessBoard.way(3, 0, 0, 3);
        assertThat(way, is(3));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(3, 0, 3, 4);
        assertThat(way, is(0));
    }
}