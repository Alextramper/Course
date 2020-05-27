package Codewars;


import java.util.Arrays;

public class sd {
    public static void main(String[] args) {
        int[] arr = {10, 2, 1};
        System.out.println(sumOfDifferences(arr));
    }
    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];

    }
}
