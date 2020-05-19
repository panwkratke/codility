package com.company;

import java.util.Stack;

public class EquiLeader {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 4, 4, 4, 2}));
    }

    public static int solution(int[] A) {

        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int count = 0;
        int leader = 0;
        int eqilLeaders = 0;
        int leftCount = 0;
        int rightCount = 0;

        for (Integer i : A) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else if (!stack.peek().equals(i)) {
                stack.pop();
            } else {
                stack.push(i);
            }
        }

        if (!stack.isEmpty()) {
            for (int i = 0; i < A.length; i++) {
                if (stack.peek().equals(A[i])) {
                    index = i;
                    count++;
                }
            }
        }

        if (count > A.length / 2) {
            leader = A[index];
        } else {
            return 0;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                leftCount++;
            }

            if (leftCount > (i + 1) / 2) {
                rightCount = count - leftCount;
                if (rightCount > (A.length - i - 1) / 2) {
                    eqilLeaders++;
                }
            }


        }

        return eqilLeaders;
    }
}
