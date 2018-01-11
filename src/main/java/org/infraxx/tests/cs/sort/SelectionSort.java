package org.infraxx.tests.cs.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] array, boolean print) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (print) {
                System.out.println("i=[" + i + "]");
            }

            int indexMin = i;

            for (int j = i + 1; j<n; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }

            int tmp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = tmp;

            if (print) {
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
