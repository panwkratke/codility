package com.company;

public class CountFactors {

    public static void main(String[] args) {
        System.out.println(solution(24));
    }

    public static int solution(int N) {

        int result = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (i == Math.sqrt(N)) {
                result++;
            } else if (N % i == 0) {
                result += 2;
            }
        }

        return result;
    }
}
