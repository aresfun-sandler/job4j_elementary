package test;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void whenp8k3then3() {
        double expected = 3.00;
        int p = 8;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp4k1then1() {
        double expected = 1.00;
        int p = 4;
        int k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp10k4then4() {
        double expected = 4.00;
        int p = 10;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}