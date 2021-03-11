package test;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void Max1(){
        int result = Max.max(8, 6);
        assertThat(result, is(8));
    }
    @Test
    public void Max2() {
        int result = Max.max(4,8);
        assertThat(result, is(8));
    }
    @Test
    public void sameNumbers() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }
}