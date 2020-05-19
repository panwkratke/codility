package com.company;

public class TapeEquilibrium {

    public static int solution(int[] A) {
        // write your code in Java SE 8

        if (A.length == 0) {
            return 0;
        }

        if (A.length == 1) {
            return A[0];
        }

        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }

        int sumLower = 0;
        int sumUpper = 0;
        int difference = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i : A) {
            sumUpper += i;
        }

        for (int i = 1; i < A.length; i++) {
            sumLower += A[i - 1];
            sumUpper -= A[i - 1];
            difference = sumLower - sumUpper;
            if (Math.abs(difference) < minDiff) {
                minDiff = Math.abs(difference);
            }
        }
        return Math.abs(minDiff);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-10, -20, -30, -40, 100}));
    }
}
