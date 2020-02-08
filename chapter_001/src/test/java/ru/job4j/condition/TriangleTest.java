package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void tr1() {
        double result;
        Point ap = new Point(0, 0);
        Point bp = new Point(0, 2);
        Point cp = new Point(2, 0);
        Triangle tr1 = new Triangle(ap, bp, cp);
        result = tr1.area();
        Assert.assertEquals(1.9, result, 0.1);
    }
}