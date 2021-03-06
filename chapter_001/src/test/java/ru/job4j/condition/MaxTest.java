package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then() {
        int result = Max.max(5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxEqual() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void max1() {
        int res = Max.max(31, 12, 2222, 4);
        assertThat(res, is(2222));
    }

    @Test
    public void max2() {
        int res = Max.max(3121, 312, 222);
        assertThat(res, is(3121));
    }
}

