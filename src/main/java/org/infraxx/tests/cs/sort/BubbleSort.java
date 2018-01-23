package org.infraxx.tests.cs.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array, boolean print) {
        int n = array.length;

        for (int i = n-1; i > 1; i--) {
            if (print) {
                System.out.println("i=[" + i + "]");
            }
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }


            }

            if (print) {
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
