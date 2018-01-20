package org.infraxx.tests.cs.search;

import java.io.Console;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class ArraySearchUtils {
    private static final Logger LOGGER = Logger.getLogger(ArraySearchUtils.class.getName());

    private static void updateMaxInStore(Map<Integer, Set<Integer>> store, int max, int index) {
        if (!store.containsKey(max)) {
            store.put(max, new HashSet<Integer>());
        }

        store.get(max).add(index);
    }

    public static Map<Integer, Set<Integer>> findMax(int[] array) {
        Map<Integer, Set<Integer>> store = new HashMap<Integer, Set<Integer>>();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            LOGGER.info("Processing " + i + ": " + array[i]);
            if (array[i] >= max) {
                LOGGER.info("Array[i] " + array[i] + "=>" + max);
                max = array[i];
                updateMaxInStore(store, max, i);
            }
        }

        return store;
    }

    public static void main(String[] argv) {
        System.out.println(ArraySearchUtils.findMax(new int[] {1, 3, 44, 0, -1, 44}));
    }
}
