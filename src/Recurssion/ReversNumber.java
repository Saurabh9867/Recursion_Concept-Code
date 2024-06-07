package Recurssion;

public class ReversNumber {
    public static void main(String[] args) {
        int result = reversNumberImpl(1);
        System.out.println(result);
    }
    private static int reversNumberImpl(int n){
        if(n == 0)
            return n;
        return (n%10 * getTenMultiple(n)) + reversNumberImpl(n/10);
    }

    private static int getTenMultiple(int n){
        int tenMultiple = 1;
        while(n != 0 && n % 10 != n){
            tenMultiple *= 10;
            n = n / 10;
        }
        return tenMultiple;
    }
}
