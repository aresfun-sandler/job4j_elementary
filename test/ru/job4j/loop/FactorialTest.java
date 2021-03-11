package test;

import org.junit.Test;
import ru.job4j.loop.Factorial;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int out = Factorial.calc(5);
        int expected = 120;
        assertThat(out, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int out = Factorial.calc(0);
        int expected = 1;
        assertThat(out, is(expected));
    }
}