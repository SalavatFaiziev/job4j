package ru.job4j.array;
/**
 * Check word by chars in array
 * @author Faiziev Salavat
 * @version $Id$
 * @since 0.1
 */

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i=0; i<pref.length; i++) {
            if (word[i]!=pref[i]) {
                result=false;
            }
        }
        return result;
    }
}