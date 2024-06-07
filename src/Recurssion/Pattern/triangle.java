package Recurssion.Pattern;

public class triangle {
    public static void main(String[] args) {
        int n = 4;
        triangleImpl(n,0);
    }
    private static void triangleImpl(int row, int col) {
        if (row == 0)
            return;
        if (col != row) {
            triangleImpl(row, col + 1);
            System.out.print("*");
        } else {
            triangleImpl(row - 1, 0);
            System.out.println();
        }
    }
}
