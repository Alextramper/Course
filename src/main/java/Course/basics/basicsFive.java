package Course.basics;

import java.util.Scanner;

public class basicsFive {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n;
    int m;
        System.out.println("Enter first number");
        n = sc.nextInt();
        System.out.println("Enter second number");
        m =sc.nextInt();

      int[][] arr = new int[n][m];;
      int k = 1;
      for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            arr[i][j] = k;
            if(arr[i][j]%2 != 0)
            System.out.print(arr[i][j] + " ");
            k=k+2;
        }
        System.out.println();
    }
    }
}
