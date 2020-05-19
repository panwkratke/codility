package com.company;

import java.util.Stack;

public class Fish {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
    }

    public static int solution(int[] A, int[] B) {

        if (A.length == 0) {
            return 0;
        }

        if (A.length == 1) {
            return 1;
        }

        int survived = A.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                stack.push(A[i]);
            }

            if (B[i] == 0) {
                while (!stack.isEmpty()) {
                    if (stack.peek() > A[i]) {
                        survived--;
                        break;
                    } else {
                        survived--;
                        stack.pop();
                    }
                }
            }
        }

        return survived;
    }
}
