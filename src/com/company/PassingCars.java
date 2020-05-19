package com.company;

public class PassingCars {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 0, 1, 1}));
    }

    public static int solution(int[] A) {
        int result = 0;
        int factor = 0;
        boolean zeros = true;

        if (A.length == 0 || A.length == 1) {
            return 0;
        }

        if (A.length == 2) {
            if (A[0] == 0 && A[1] == 1) {
                return 1;
            } else {
                return 0;
            }
        }

        for (int i = 0; i < A.length; i++) {

            if (A[i] == 0) {
                factor++;
                zeros = false;
            }

            if (A[i] == 1) {
                result += factor;
                if (result > 1000000000) {
                    return -1;
                }
            }
        }

        if (zeros) {
            return 0;
        }

        return result;
    }
}
