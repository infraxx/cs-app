package org.infraxx.tests.cs.sort;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] array, boolean print) {
        int n = array.length;

        qsort(array, 0, n-1, print);
    }

    private static void qsort(int[] array, int lower, int higher, boolean print) {


        int i = lower;
        int j = higher;

        int pivotIndex = lower + (higher - lower) / 2;
        int pivot = array[pivotIndex];

        if (print) {
            System.out.println("lower = [" + lower + "], higher = [" +
                    higher + "], pivotIndex = ["+ pivotIndex + "], pivot = [" + pivot + "]"
            );
            System.out.println(Arrays.toString(array));
        }

        while (i < j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;

                i++;
                j--;
            }
        }

        if (lower < j) {
            qsort(array, lower, j, print);
        }

        if (higher > i) {
            qsort(array, i, higher, print);
        }
    }
}
