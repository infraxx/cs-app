package org.infraxx.tests.cs.diff;

public class Factorial {
    public static int factorial(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }

    public static int factorialRec(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorialRec(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorialRec(0));
        System.out.println("--------");
        System.out.println(factorial(1));
        System.out.println(factorialRec(1));
        System.out.println("--------");
        System.out.println(factorial(2));
        System.out.println(factorialRec(2));
        System.out.println("--------");
        System.out.println(factorial(5));
        System.out.println(factorialRec(5));
    }
}
