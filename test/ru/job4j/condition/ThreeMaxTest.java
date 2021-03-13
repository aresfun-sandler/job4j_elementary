package test;

import org.junit.Test;
import ru.job4j.condition.ThreeMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int rsl = ThreeMax.max(13, 5, 1);
        assertThat(rsl, is(13));
    }

    @Test
    public void secondMax() {
        int rsl = ThreeMax.max(10, 50, 1);
        assertThat(rsl, is(50));
    }

    @Test
    public void thirdMax() {
        int rsl = ThreeMax.max(1, 5, 100) ;
        assertThat(rsl, is(100));
    }

    @Test
    public void allEq() {
        int rsl = ThreeMax.max(1, 1, 1);
        assertThat(rsl, is(1));
    }

    @Test
    public void firstEqSecond() {
        int rsl = ThreeMax.max(10, 10, 1);
        assertThat(rsl, is(10));
    }

    @Test
    public void firstEqThird() {
        int rsl = ThreeMax.max(100, 1, 100);
        assertThat(rsl, is(100));
    }

    @Test
    public void secondEqThird() {
        int rsl = ThreeMax.max(1, 100, 100);
        assertThat(rsl, is(100));
    }
}