package org.infraxx.tests.cs.sort;

import org.testng.annotations.Test;

public class BubbleSortTest {

    @Test
    public void testSort() {
        int[] array = {3, 2, 5, 9, 0, -1, 12, 15, 67, 5, 7, 7, 11, 18};
        
        BubbleSort.sort(array, true);
    }
}
