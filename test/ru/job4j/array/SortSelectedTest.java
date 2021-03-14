package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {9, 4, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 7, 9};
        assertThat(result, is(expected));
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {9, 6, 12, 3, 18};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 6, 9, 12, 18};
        assertThat(result, is(expected));
    }
}