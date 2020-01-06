package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial fc=new Factorial(); {
            int res = fc.calc(5);
            assertThat(res,is(120));
        }
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fc=new Factorial(); {
            int res = fc.calc(0);
            assertThat(res,is(1));
        }
    }
}
