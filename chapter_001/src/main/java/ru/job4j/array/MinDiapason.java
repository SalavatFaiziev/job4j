package ru.job4j.array;

public class MinDiapason {
    static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }
}