package Recurssion.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        final int lowIndex = 0;
        int[] arr = {65,70,52,11,12};
        quickSortImpl(arr,lowIndex, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSortImpl(int[] arr, int low, int high){
        if(low >= high)
            return;

        int start = low;
        int end = high;
        int mid = (low + high) / 2;
        int pivot = arr[mid];

        while(start <= end){

            while(arr[start] < pivot){
                start++;
            }
            while(pivot < arr[end]){
                end--;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSortImpl(arr, low, end);
        quickSortImpl(arr, start, high);
    }
}
