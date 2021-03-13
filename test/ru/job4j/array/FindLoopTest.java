package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4Then3() {
        int[] data = {1, 3, 4, 6, 8};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHas6ThenNoFound() {
        int[] data = {1, 3, 2, 5};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFind5() {
        int[] data = new int[] {5, 2, 10, 2, 4, 5, 7};
        int el = 5;
        int start = 5;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind() {
        int[] data = new int[] {5, 1, 10, 2, 4, 5, 7};
        int el = 4;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}