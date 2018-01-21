package org.infraxx.tests.cs.diff;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysDiff {
    // reverse ann array

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            System.out.println(i);
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }

        return Arrays.copyOf(array, array.length);
    }

    // You have got a range of numbers between 1 to N, where one of the number is
    // repeated. You need to write a program to find out the duplicate number.
    public static int findRepeatingNumber(int[] array) {
        Set<Integer> existing = new HashSet<>();
        for (int element: array) {
            if (existing.contains(element)) {
                return element;
            }

            existing.add(element);
        }

        return 0;
    }

    public static int findRepeatingNumber2(int[] array) {
        int max = array[array.length - 1];
        int sum = 0, expectedSum = max*(max + 1) / 2;

        for(int element: array) {
            sum += element;
        }

        return sum - expectedSum;
    }

//    You are given an array of numbers. Find out the array index or position
//    where sum of numbers preceeding the index is equals to sum of numbers
//    succeeding the index.



//    Write a program to find top two maximum numbers in the
//    given array. You should not use any sorting functions. You
//    should iterate the array only once. You should not use any
//    kind of collections in java.

    public static int[] twoMax(int[] array) {
        if (array.length < 1) {
            return new int[]{};
        }

        if (array.length < 2) {
            return new int[] {array[0], array[0]};

        }
       int max1 = array[0];
       int max2 = array[0];

       for (int i = 1; i<array.length; i++) {
           if (array[i] > max2) {
               max1 = max2;
               max2 = array[i];
           }
           else if (array[i] > max1) {
               max1 = array[i];
           }

           System.out.println(array[i] + " " + max1 + " " + max2);
       }

       return new int[] {max1, max2};
    }

//    Write a program to identify common elements or numbers between
//    two given arrays. You should not use any inbuilt methods are list to
//    find common values.

//    The below example shows how to avoid duplicate elements from an array and disply only distinct elements.
//    Please use only arrays to process it.
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(reverse(new int[] {0, 1, 2, 3, 4})));
//        System.out.println(Arrays.toString(reverse(new int[] {0, 1})));
//        System.out.println(Arrays.toString(reverse(new int[] {0})));

//        System.out.println(findRepeatingNumber(new int[] {1, 2, 3, 4, 5, 6, 7}));
//        System.out.println(findRepeatingNumber2(new int[] {1, 2, 3, 4, 5, 6, 7}));
//
//        System.out.println(findRepeatingNumber(new int[] {1, 2, 3, 4, 4, 5, 6, 7}));
//        System.out.println(findRepeatingNumber2(new int[] {1, 2, 3, 4, 4, 5, 6, 7}));
//
//        System.out.println(findRepeatingNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 1}));
//        System.out.println(findRepeatingNumber2(new int[] {1, 2, 3, 4, 5, 6, 7, 1}));
//
//        System.out.println(findRepeatingNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 7}));
//        System.out.println(findRepeatingNumber2(new int[] {1, 2, 3, 4, 5, 6, 7, 7}));

        System.out.println(Arrays.toString(twoMax(new int[] {1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(twoMax(new int[] {1, 2, 3, 4, 5, 6, 7, -1, 11, 0, 25, 9})));
        System.out.println(Arrays.toString(twoMax(new int[] {5,34,78,2,45,1,99,23})));
    }
}
