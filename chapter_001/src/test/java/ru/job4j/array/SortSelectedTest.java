package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void test1() {
        int[] input = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void test2() {
        int[] input = new int[] {3, 3, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {3, 3, 3};
        assertThat(result, is(expect));
    }@Test
    public void test3() {
        int[] input = new int[] {33, 23, 13, 3, 0, 19};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 3, 13, 19, 23, 33};
        assertThat(result, is(expect));
    }
}