package Recurssion.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {54, 23, 95, 11, 2, 1};
        bubbleSortImpl(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortImpl(int[] arr, int count, int index){
        if(count == 0)
            return;
        if(index < count){
            if(arr[index] > arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            bubbleSortImpl(arr,count,index + 1);
        }
        else{
            bubbleSortImpl(arr, count - 1, 0);
        }
    }
}
