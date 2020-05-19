package com.company;

import java.util.Stack;

public class Dominator {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 1, 1, 3}));
    }

    public static int solution(int[] A) {

        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int count = 0;

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
            return index;
        } else {
            return -1;
        }
    }
}
