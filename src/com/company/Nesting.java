package com.company;

import java.util.Stack;

public class Nesting {

    public int solution(String S) {

        if (S.length() == 0) {
            return 1;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push(')');
            } else if (S.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return 0;
                } else {
                    char temp = stack.pop();
                    if (temp != S.charAt(i)) {
                        return 0;
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            return 0;
        } else {
            return 1;
        }
    }
}
