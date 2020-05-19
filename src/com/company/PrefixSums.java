package com.company;

public class PrefixSums {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }

    public static int solution(int[] A) {

        int index = 0;
        double minAverage = (A[0] + A[1]) / 2.0;
        double curAverage;

        for (int i = 0; i < A.length - 2; i++) {

            curAverage = (A[i] + A[i + 1]) / 2.0;
            if (curAverage < minAverage) {
                minAverage = curAverage;
                index = i;
            }

            curAverage = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            if (curAverage < minAverage) {
                minAverage = curAverage;
                index = i;
            }
        }

        curAverage = (A[A.length - 2] + A[A.length - 1]) / 2.0;
        if (curAverage < minAverage) {
            minAverage = curAverage;
            index = A.length - 2;
        }

        return index;
    }
}
