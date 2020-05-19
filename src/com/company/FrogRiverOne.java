package com.company;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static int solution(int X, int[] A) {

        Set<Integer> leafs = new HashSet<>();

        if (A.length == 0 || X == 0) {
            return -1;
        }

        if (A.length == 1 && X > 1) {
            return -1;
        }

        for (int i = 1; i <= X; i++) {
            leafs.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            leafs.remove(A[i]);
            if (leafs.isEmpty()) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
}
