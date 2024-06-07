package Recurssion.Arrays;

public class isSortedArray {

    public static void main(String[] args) {
        final int startIndex = 0;
        int[] arr = {1,2,60,4,5};

        System.out.println(isSortedImpl(arr,startIndex));
    }

    private static boolean isSortedImpl(int[] arr, int index){
        if(index == arr.length - 1)
            return true;
        return arr[index] < arr[index + 1] && isSortedImpl(arr, index+ 1);
    }

    //Optimized Code
    private static boolean isSortedImplOptimize(int arr[], int index){
        if(index == arr.length - 1)
            return true;
        if(arr[index] < arr[index + 1])
            return isSortedImplOptimize(arr, index+1);
        return false;
    }
}
