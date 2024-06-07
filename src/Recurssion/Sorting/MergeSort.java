package Recurssion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSortImpl(arr)));
    }

    private static int[] mergeSortImpl(int[] arr){
        if(arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSortImpl(Arrays.copyOfRange(arr, 0,mid));
        int[] right = mergeSortImpl(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeArray(left, right);
    }

    private static int[] mergeArray(int[] firstArray, int[] secondArray){

        int[] mix = new int[firstArray.length + secondArray.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < firstArray.length && j < secondArray.length){
            if(firstArray[i] < secondArray[j]){
                mix[k] = firstArray[i];
                i++;
            }
            else{
                mix[k] = secondArray[j];
                j++;
            }
            k++;
        }

        while (i < firstArray.length){
            mix[k] = firstArray[i];
            i++;
            k++;
        }
        while (j < secondArray.length){
            mix[k] = secondArray[j];
            j++;
            k++;
        }
        return mix;
    }
}
