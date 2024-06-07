package Recurssion;

public class FactorialNumber {

    public static void main(String[] args) {
        int result = factorialNumberImpl(6);
        System.out.println(result);
    }

    private static int factorialNumberImpl(int n){
        if(n == 1)
            return n;
        return n * factorialNumberImpl(n-1);
    }
}
