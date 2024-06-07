package Recurssion;

public class SumOfDigits {
    public static void main(String[] args) {
        int result = sumOfDigitsImpl(513424);
        System.out.println(result);
    }

    private static int sumOfDigitsImpl(int n){
        if(n == 0)
            return n;
        return n%10 + sumOfDigitsImpl(n/10);
    }
}
