package org.infraxx.tests.cs.diff;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    static {
        memo.put(0, 0);
        memo.put(1, 1);
    }

    public static int fibonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int f = fibonacci(n-2) + fibonacci(n-1);
        memo.put(n, f);
        return f;
    }

    public static int fibonacciLoop(int n) {
        if (n < 2) return n;
        int prevPrev = 0, prev = 1, f = 0;
        for (int i = 2; i <= n; i++) {
            f = prevPrev + prev;
            prevPrev = prev;
            prev = f;
        }

        return f;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.fibonacciLoop(0));
        System.out.println(Fibonacci.fibonacciLoop(1));
        System.out.println(Fibonacci.fibonacciLoop(2));
        System.out.println(Fibonacci.fibonacciLoop(3));
        System.out.println(Fibonacci.fibonacciLoop(4));
        System.out.println(Fibonacci.fibonacciLoop(5));
        System.out.println(Fibonacci.fibonacciLoop(6));
        System.out.println(Fibonacci.fibonacciLoop(7));
        System.out.println(Fibonacci.fibonacciLoop(10000));

        System.out.println("-------");

        System.out.println(Fibonacci.fibonacci(0));
        System.out.println(Fibonacci.fibonacci(1));
        System.out.println(Fibonacci.fibonacci(2));
        System.out.println(Fibonacci.fibonacci(3));
        System.out.println(Fibonacci.fibonacci(4));
        System.out.println(Fibonacci.fibonacci(5));
        System.out.println(Fibonacci.fibonacci(10000));
    }
}
