package Recurssion.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int find = 5;
        System.out.println(binarySearch(arr, find, 0, arr.length - 1));
    }

    //return -1 if element is not present in Array
    private static int binarySearch(int[] arr,int ele, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] == ele)
                return mid;
            if(ele < arr[mid])
                return binarySearch(arr, ele, left, mid-1);
            return binarySearch(arr, ele, mid+1, right);
        }
        return -1;
    }

    // Code without using recursion
    private static int binarySearchWORec(int[] arr, int ele){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == ele)
                return mid;
            if(arr[mid] > ele)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
