package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void euToRu() {
        int in = 8;
        int expected = 560;
        int out = Converter.eurToRub(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void usdToRu() {
        int in = 10;
        int expected = 600;
        int out = Converter.usdToRub(in);
        Assert.assertEquals(expected, out);
    }
}
