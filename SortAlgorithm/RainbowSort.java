package com.codeReview.SortAlgorithm;

import java.util.Arrays;

public class RainbowSort {
    public static void main(String[] args) {
        RainbowSort solution = new RainbowSort();
        int[] arr = new int[]{1, -1, 0, -1, 0, 1, 0, 0, 1, -1, 1};
        arr = solution.rainbowSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] rainbowSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        int neg = 0;
        int zero = 0;
        int one = arr.length - 1;

        while (zero <= one) {
            if (arr[zero] == -1) {
                swap(arr, neg++, zero++);
            } else if (arr[zero] == 0) {
                zero++;
            } else {
                swap(arr, zero, one--);
            }
        }
        return arr;
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
