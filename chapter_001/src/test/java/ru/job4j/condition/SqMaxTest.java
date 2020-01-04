package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        int res = SqMax.max(11, 2, 3, 4);
        assertThat(res, is(11));
    }
    @Test
    public void whenSecondMax(){
        int res = SqMax.max(1,22,3,4);
        assertThat(res,is(22));
    }
    @Test
    public void whenThirdMax(){
        int res = SqMax.max(1,2,33,4);
        assertThat(res,is(33));
    }
    @Test
    public void whenFourthMax() {
        int res = SqMax.max(1, 2, 3, 44);
        assertThat(res, is(44));
    }
    @Test
    public void whenEqual() {
        int res = SqMax.max(1, 1, 1, 1);
        assertThat(res, is(1));
    }

}
