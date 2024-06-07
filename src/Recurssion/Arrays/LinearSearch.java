package Recurssion.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        final int startIndex = 0;
        int arr[] = {5,12,88,1,30};
        int find = 86;
        System.out.println(linearSearchImpl(arr,find,startIndex));
    }

    private static boolean linearSearchImpl(int[] arr, int ele, int index){
        if(index == arr.length)
            return false;
        return arr[index] == ele || linearSearchImpl(arr, ele, index+1);
    }

}
