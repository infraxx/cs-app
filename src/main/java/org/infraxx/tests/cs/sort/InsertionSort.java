package org.infraxx.tests.cs.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] array, boolean print) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            if (print) {
                System.out.println("i=[" + i + "]");
            }

            int tmp = array[i];

            int j = i;
            while (j > 0 && array[j-1] >= tmp) {
                array[j] = array[j-1];
                j--;
            }

            array[j] = tmp;

            if (print) {
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
