package com.company;

public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }

    public static int solution(int[] A) {

        if (A.length < 2) {
            return 0;
        }

        int min = A[0];
        int earned = 0;
        int value = 0;
        for (int i = 1; i < A.length; i++) {
            value = A[i];
            earned = Math.max(earned, value - min);
            min = Math.min(min, value);
        }
        return earned;
    }
}
