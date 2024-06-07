package Recurssion.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {54, 12, 95, 1};
        selectionSortImpl(arr, arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSortImpl(int[] arr, int count, int index, int maxIndex){
        if(count == 0)
            return;
        if(index <= count){
            if(arr[index] > arr[maxIndex])
                maxIndex = index;
            selectionSortImpl(arr, count, index+1, maxIndex);
        }
        else{
            int temp = arr[count];
            arr[count] = arr[maxIndex];
            arr[maxIndex] = temp;
            selectionSortImpl(arr, count-1, 0, 0);
        }
    }
}
