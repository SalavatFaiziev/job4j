package ru.job4j.array;
/**
 * Check word end by chars in array
 * @author Faiziev Salavat
 * @version $Id$
 * @since 0.1
 */

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i=0; i < post.length; i++) {
            if (word[word.length-i-1] != post[post.length-i-1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}