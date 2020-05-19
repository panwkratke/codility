package com.company;

import java.util.ArrayList;
import java.util.List;

public class Flags {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }

    public static int solution(int[] A) {

        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > Math.max(A[i - 1], A[i + 1])) {
                peaks.add(i);
            }
        }

        int start = 1;
        int end = peaks.size();
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (flagPossibility(peaks, mid)) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (flagPossibility(peaks, end)) {
            return end;
        }

        if (flagPossibility(peaks, start)) {
            return start;
        }

        return 0;
    }

    private static boolean flagPossibility(List<Integer> peaks, int flags) {
        if (peaks.size() == 0) {
            return false;
        }

        int lastIndex = peaks.get(0);
        int usedFlags = 1;
        for (int i = 1; i < peaks.size(); i++) {
            if (peaks.get(i) - lastIndex >= flags) {
                usedFlags++;
                lastIndex = peaks.get(i);
            }
            if (usedFlags == flags) {
                return true;
            }
        }
        return usedFlags == flags;
    }
}
