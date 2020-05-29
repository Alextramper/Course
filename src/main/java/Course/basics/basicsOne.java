package Course.basics;

import java.util.Arrays;
import java.util.Random;

public class basicsOne {

    public static void main(String[] args) {
        int arr[] = new int[8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(midInt(arr));
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int midInt(int[] arr) {
        int sum = 0;
        int mid;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        mid = sum / arr.length;
        return mid;
    }
}
