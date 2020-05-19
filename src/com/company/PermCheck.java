package com.company;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1}));
    }

    public static int solution(int[] A) {

        if (A.length == 0) {
            return 0;
        }

        Set<Integer> setTested = new HashSet<>(A.length);
        Set<Integer> setPerfect = new HashSet<>(A.length);

        for (int i = 0; i < A.length; i++) {
            setTested.add(A[i]);
            setPerfect.add(i + 1);
        }

        for (Integer i : setPerfect) {
            if (!setTested.contains(i)) {
                return 0;
            }
        }
        return 1;
    }
}
