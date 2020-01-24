package ru.job4j.sort;
import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, k = 0;
        while (i + k != rsl.length) {
            if (k == right.length || i != left.length && left[i] <= right[k]) {
                rsl[i + k] = left[i];
                i++;
            } else {
                rsl[i + k] = right[k];
                k++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}