package test;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        short in = 187;
        double expected = 88.55;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}