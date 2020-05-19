package com.company;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 5, 2, 1, 4, 0}));
    }

    public static int solution(int[] A) {

        long[] diskStartPoint = new long[A.length];
        long[] diskEndPoint = new long[A.length];
        long intersections = 0;
        int openDiscs = 0;

        for (int i = 0; i < A.length; i++) {
            diskStartPoint[i] = i - (long) A[i];
            diskEndPoint[i] = i + (long) A[i];
        }

        Arrays.sort(diskStartPoint);
        Arrays.sort(diskEndPoint);
        int endPointer = 0;

        for (int i = 0; i < diskStartPoint.length; i++) {
            if (diskStartPoint[i] <= diskEndPoint[endPointer]) {
                intersections += openDiscs;
                if (intersections > 10000000) {
                    return -1;
                }
                openDiscs++;
            } else {
                endPointer++;
                openDiscs--;
                i = i - 1;
            }
        }

        return (int) intersections;
    }
}
