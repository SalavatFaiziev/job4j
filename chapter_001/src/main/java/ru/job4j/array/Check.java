package ru.job4j.array;
/**
 * Check array elements.
 * @author Faiziev Salavat
 * @version $Id$
 * @since 0.1
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i =0; i<data.length-1; i++) {
            if (data[i]!=data[i+1]) {
                result=false;
                break;
            }
       }
        return result;
    }
}