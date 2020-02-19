package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 2);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(33, 22, 11);
        double out = a.distance3d(b);
        Assert.assertEquals(38.57, out, 0.01);
    }
}