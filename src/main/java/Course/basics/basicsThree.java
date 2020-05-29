package Course.basics;

import java.util.Arrays;
import java.util.Scanner;

public class basicsThree {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]= new int[n];
        for(int i=0, j=1; i<n; i++, j++) {
            arr[i] = j;
            if(primeNumber(arr[i])==1) {
                System.out.print(arr[i] + " ");
            }

        }
    }
    private static int primeNumber(int number) {
        for (int i=2; i<number; i++) {
            if (number%i == 0) {
                return 0; }
            if ((i==number) || (i>Math.sqrt(number))) {
                return 1; }
        }
        return 0;
    }
}
