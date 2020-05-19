package com.company;

public class FrogJmp {

    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        if (X == Y) {
            return 0;
        }

        if (X + D >= Y) {
            return 1;
        }

        int distanceToMake = Y - X;
        int jumpsRequired = distanceToMake / D;
        if (distanceToMake % D == 0) {
            return jumpsRequired;
        } else {
            return ++jumpsRequired;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }
}
