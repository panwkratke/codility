package com.company;

import java.util.Arrays;

public class MaxProductOfThree {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 7, 3, 2, 1, -3, -5}));
    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        int max1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int max2 = A[0] * A[1] * A[A.length - 1];
        int max = Math.max(max1, max2);

        return max;
    }
}
