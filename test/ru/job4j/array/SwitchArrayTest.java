package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {2, 4, 5, 8, 9};
        int[] expected = {2, 9, 5, 8, 4};
        int[] rsl = SwitchArray.swap(input, 1, input.length - 1);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSwap3to0() {
        int[] input = {2, 4, 5, 8, 9};
        int[] expected = {8, 4, 5, 2, 9};
        int[] rsl = SwitchArray.swap(input, 3, 0);
        assertThat(rsl, is(expected));
    }
}