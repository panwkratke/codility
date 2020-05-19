package com.company;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static void main(String[] args) {
        Arrays.stream(solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})).forEach(System.out::print);
    }

    public static int[] solution(String S, int[] P, int[] Q) {

        int[] result = new int[P.length];
        int[][] prefixSums = new int[3][S.length() + 1];
        short a;
        short c;
        short g;
        int startInd = 0;
        int endInd = 0;

        for (int i = 0; i < S.length(); i++) {
            a = 0;
            c = 0;
            g = 0;

            if (S.charAt(i) == 'A') {
                a = 1;
            } else if (S.charAt(i) == 'C') {
                c = 1;
            } else if (S.charAt(i) == 'G') {
                g = 1;
            }

            prefixSums[0][i + 1] = prefixSums[0][i] + a;
            prefixSums[1][i + 1] = prefixSums[1][i] + c;
            prefixSums[2][i + 1] = prefixSums[2][i] + g;
        }

        for (int i = 0; i < P.length; i++) {
            startInd = P[i];
            endInd = Q[i] + 1;

            if (prefixSums[0][endInd] - prefixSums[0][startInd] > 0) {
                result[i] = 1;
            } else if (prefixSums[1][endInd] - prefixSums[1][startInd] > 0) {
                result[i] = 2;
            } else if (prefixSums[2][endInd] - prefixSums[2][startInd] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }

        }
        return result;
    }
}
