package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] in = {
                {1, -2, -4},
                {1, 2, 6}
        };
        int[][] expect = {
                {1, 0, 0},
                {1, 2, 6}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}