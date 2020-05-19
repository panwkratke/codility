package com.company;

import java.util.Stack;

public class StoneWall {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}));
    }

    public static int solution(int[] H) {

        Stack<Integer> stack = new Stack<>();
        int numBlock = 0;

        for (int value : H) {
            while (!stack.isEmpty() && stack.peek() > value) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                numBlock++;
                stack.push(value);
            } else if (stack.peek() < value) {
                numBlock++;
                stack.push(value);
            }
        }
        return numBlock;
    }
}
