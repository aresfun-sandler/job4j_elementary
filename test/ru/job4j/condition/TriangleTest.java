package test;

import org.junit.Test;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(3, 4, 5);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotexist() {
        boolean result = Triangle.exist(11, 4, 5);
        assertThat(result, is(false));
    }
}