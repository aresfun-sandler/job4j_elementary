package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.EqLast.check;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 4};
        int[] right = {5, 4, 4};
        assertThat(check(left, right), is(true));
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        assertThat(check(left, right), is(false));
    }
}