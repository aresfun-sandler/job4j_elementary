package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when34to20then412() {
        double expected = 4.12;
        int x1 = 3;
        int y1 = 4;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when51to28then761() {
        double expected = 7.61;
        int x1 = 5;
        int y1 = 1;
        int x2 = 2;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when39to72then806() {
        double expected = 8.06;
        int x1 = 3;
        int y1 = 9;
        int x2 = 7;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}