package com.company;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public static int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for (Integer i : A) {
            set.add(i);
        }

        return set.size();
    }
}
