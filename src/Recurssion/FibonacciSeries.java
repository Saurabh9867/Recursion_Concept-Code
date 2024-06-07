package Recurssion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int result = fibonacciSeriesImpl(5);
        System.out.println(result);
    }

    private static int fibonacciSeriesImpl(int n){
        if(n < 2)
            return n;
        return fibonacciSeriesImpl(n-1) + fibonacciSeriesImpl(n-2);
    }
}
