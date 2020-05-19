package com.company;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 1) {
            return A[0];
        }
        if (A.length % 2 == 0) {
            return 0;
        }

        quickSort(A, 0, A.length - 1);

//        Arrays.stream(A).forEach(System.out::print);
        for (int i = 0; i < A.length; i += 2) {
            if (i == A.length - 1) {
                return A[i];
            }
            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }
        return 0;
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);

            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        int temp;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 5, 6, 3, 6, 2, 5, 3, 9}));
    }
}
