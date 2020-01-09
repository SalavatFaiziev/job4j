package ru.job4j.array;
/**
 * Turn array backwards.
 * @author Faiziev Salavat
 * @version $Id$
 * @since 0.1
 */

public class Turn {
    public int[] back(int[] array) {
        for(int index = 0; index < array.length/2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}