package Course.basics;

import java.util.Random;
import java.util.Scanner;

public class basicsFour {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int n = in.nextInt();
        rem(n,arr);


    }

    public static void rem(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (n != arr[i]) {
                    System.out.print(arr[i] + " ");
                }
        }
    }
}
