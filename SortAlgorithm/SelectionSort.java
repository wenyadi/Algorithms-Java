package com.codeReview.SortAlgorithm;


import java.util.Arrays;

// Time = O(n^2)
public class SelectionSort {
    public int[] selectionSort(int[] array){
        if (array == null || array.length <= 1) {
            return array;
        }

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap (array, i, min);
        }
        return array;
    }

    public void swap(int[] arr, int left, int right) {
        int tmp  = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] a = {2, -1, 3, 5};
        a = s.selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}

