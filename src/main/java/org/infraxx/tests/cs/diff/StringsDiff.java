package org.infraxx.tests.cs.diff;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class StringsDiff {
    private static Logger LOGGER = Logger.getLogger(StringsDiff.class.getName());

    //    Write a program to find out duplicate or repeated characters in a
//    string, and calculate the count of repeatation.

//    This page gives an example to print all permutations of a given string. For example, xy would be xy and yx.
//
//    Here is the steps to implement string permutations:
//
//    Take out the first char and keep it constant. And permute rest of the characters.
//    User recursive method call to permute rest of the string except first character.
//    While making recursive call, we accumulate each character being constant along with recursive call response.

    public static List<String> permutations(String input) {
        List<String> store = new LinkedList<>();
        permutation("", input, store);
        return store;
    }

    public static void permutation(String prefix, String str, List<String> store) {
        System.out.println("Input: " + str);
        int n = str.length();

        if (n == 0) {
            System.out.println("Found: " + prefix);
            store.add(prefix);
        }
        else {
            for (int i=0; i < n; i++) {
                String prefix1 = prefix + str.charAt(i);
                String substr = str.substring(0, i) + str.substring(i + 1, n);
                System.out.println(prefix1 + " " + substr);
                permutation(prefix1, substr, store);
            }
        }
    }

    public static void main(String[] args) {
        permutations("test");
    }
}
