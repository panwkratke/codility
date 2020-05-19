package com.company;

public class PermMissingElem {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        boolean flag = true;

        if (A.length < 1) {
            return 1;
        }

        if (A.length == 1) {
            if (A[0] > 1) {
                return 1;
            } else {
                return 2;
            }
        }

        myQuickSort(A, 0, A.length - 1);

        if (A.length == 2) {
            if (A[0] > 1) {
                return 1;
            } else if (A[0] == 1) {
                if (A[0] + 1 != A[1]) {
                    return A[0] + 1;
                } else {
                    return A[1] + 1;
                }
            }
        }

        for (int i = 0; i < A.length - 1; i++) {
            if (i == 0) {
                if (A[i] > 1) {
                    return 1;
                }
            }
            if (A[i] + 1 != A[i + 1]) {
                flag = false;
                result = A[i] + 1;
            }
        }

        if (flag) {
            result = A[A.length - 1] + 1;
        }
        return result;
    }

    public static void myQuickSort(int[] arrayToSort, int start, int end) {

        if (start >= end) {
            return;
        }

        int currentCut = partition(arrayToSort, start, end);

        if (currentCut - start < end - currentCut) {
            myQuickSort(arrayToSort, start, currentCut - 1);
            myQuickSort(arrayToSort, currentCut + 1, end);
        } else {
            myQuickSort(arrayToSort, currentCut + 1, end);
            myQuickSort(arrayToSort, start, currentCut - 1);
        }
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = (start + end) / 2;
        int pivotValue = arr[pivot];
        int i = start - 1;
        int temp = 0;

        for (int j = start; j <= end; j++) {
            if (arr[j] < pivotValue) {
                i++;
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    if (i == pivot) {
                        pivot = j;
                    }
                }
            }
        }

        temp = arr[i + 1];
        arr[i + 1] = arr[pivot];
        arr[pivot] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 1}));
    }
}
