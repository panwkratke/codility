package com.company;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for (Integer i : A) {
            set.add(i);
        }

        if (A.length == 0) {
            return 1;
        }

        if (A.length == 1) {
            if (A[0] != 1) {
                return 1;
            } else {
                return 2;
            }
        }

        for (int i = 1; i < A.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return A.length + 1;
    }
}
