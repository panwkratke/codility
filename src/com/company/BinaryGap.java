package com.company;

public class BinaryGap {

    public static int solution(int N) {
        // write your code in Java SE 8
        if (N <= 2) {
            return 0;
        }

        int maxGap = 0;
        int currentGap = 0;

        String binaryRepresentation = Long.toBinaryString(N);
        char[] binaryRepresentationCharArr = binaryRepresentation.toCharArray();

        for (int i = 0; i < binaryRepresentationCharArr.length - 1; i++) {
            if (binaryRepresentationCharArr[i] == '1') {

                if (i == binaryRepresentationCharArr.length - 2) {
                    break;
                }

                for (int j = i + 1; j < binaryRepresentationCharArr.length; j++) {
                    if (binaryRepresentationCharArr[j] == '0') {
                        currentGap++;
                    } else {
                        if (currentGap > maxGap) {
                            maxGap = currentGap;
                        }
                        currentGap = 0;
                        i = j - 1;
                        break;
                    }
                }
            }
        }
        return maxGap;
    }

    public static void main(String[] args) {
        System.out.println(solution(1041));
    }
}
