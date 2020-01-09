package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
    @Test
    public void test1() {
        char[] word = {'C', 'o', 'm', 'p', 'u', 't', 'e', 'r'};
        char[] post = {'e', 'r'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }
    @Test
    public void test2() {
        char[] word = {'C', 'o', 'm', 'p', 'u', 't', 'e', 'r'};
        char[] post = {'e'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}