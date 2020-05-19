package com.company;

import java.util.Arrays;

public class MaxCounters {

    public static int[] solution(int N, int[] A) {

        int max = 0;
        int min = 0;
        int value = 0;
        int index = 0;

        int[] counters = new int[N];
        for (int i = 0; i < N; i++) {
            counters[i] = 0;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != N + 1) {
                index = A[i] - 1;
                value = counters[index];
                if (value < min) {
                    value = min + 1;
                } else {
                    value = value + 1;
                }
                counters[index] = value;
                if (value > max) {
                    max = value;
                }
            } else {
                min = max;
            }
        }

        for (int i = 0; i < N; i++) {
            if (counters[i] < min) {
                counters[i] = min;
            }
        }

        return counters;
    }

    public static void main(String[] args) {
        Arrays.stream(solution(5, new int[]{6, 1, 6, 3, 6, 2, 6, 1})).forEach(System.out::print);
    }
}
