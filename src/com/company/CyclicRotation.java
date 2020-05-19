package com.company;

import java.util.Arrays;

public class CyclicRotation {

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (A.length < 2) {
            return A;
        }

        int[] shifted = new int[A.length];
        int shift;
        if (K > A.length) {
            shift = K % A.length;
        } else {
            shift = K;
        }

        for (int i = 0; i < A.length; i++) {
            if (i + shift < A.length) {
                shifted[i + shift] = A[i];
            } else if (i + shift >= A.length) {
                shifted[i + shift - A.length] = A[i];
            }
        }
        return shifted;
    }

    public static void main(String[] args) {
        int[] result = solution(new int[]{3, 8, 9, 7, 6}, 3);
        Arrays.stream(result).forEach(System.out::print);
    }
}
