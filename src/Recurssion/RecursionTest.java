package Recurssion;

public class RecursionTest {

    public static void main(String[] args) {
        fun(5);

        //System.out.println(1%10);
    }

//    static int recurTest(int n){
//        if(n < 2)
//            return n;
//        return recurTest(n-1) + recurTest(n-2) + recurTest(n-3);
//    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(--n);
    }

}
