package com.codeReview.SortAlgorithm;

import java.util.Arrays;

/**
 * Created by yadiwen on 2017/6/5.
 */

//O(nlog(n))


public class MergeSort {
    public static void main(String[] args) {
        MergeSort solution = new MergeSort();
        int array[] = new int[]{2, 9, -1, 8, 7, 5, 4};
        array = solution.mergeSort(array);
        System.out.println(Arrays.toString(array));

        array = null;
        array = solution.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public int[] mergeSort(int[] array) {
        //base case
        if (array == null || array.length <= 1) {
            return array;
        }
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
        return array;
    }

    private void mergeSort(int[] array, int[] helper, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(array, helper, left, mid); //merge sort left
        mergeSort(array, helper, mid + 1, right); // merge sort right
        merge(array, helper, left, mid, right); //merge left and right together
    }

    private void merge(int[] array, int[] helper, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }
        int leftIndex = left;
        int rightIndex = mid + 1;
        //sorted
        while (leftIndex <= mid && rightIndex <= right) {
            if (helper[leftIndex] <= helper[rightIndex]) {
                array[left++] = helper[leftIndex++];
            } else {
                array[left++] = helper[rightIndex++];
            }
        }
        while (leftIndex <= mid) {
            array[left++] = helper[leftIndex++];
        }
    }
}
