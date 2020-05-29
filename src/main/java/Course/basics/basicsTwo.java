package Course.basics;

import java.util.Random;

public class basicsTwo {
    public static void main(String[] args) {
        int arr[] = new int[8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {
        int tmp = 0, k = arr.length-2;
        boolean is_swap = false;
        for ( int i = 0; i<=k; i++) {
            is_swap = false;
            for(int j = k; j >= i; j--) {
                if (arr[j]>arr[j+1]) {
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                    is_swap = true;
                }
                }
            if(is_swap == false) break;
        }
    }

    public static void revSort(int[] arr) {
        int tmp=0;
        boolean is_swap = false;
        for ( int i = arr.length-1; i>= 1; i--) {
            is_swap = false;
            for(int j = 0; j<i; j++) {
                tmp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = tmp;
                is_swap =true;
            }
            if (is_swap == false) break;
        }
    }
}
