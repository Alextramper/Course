package Course;


import java.util.Arrays;

public class taskFive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int s = search(arr, 0,9, 7);
        System.out.println(s);
    }
        public static int search ( int arr[], int lowerBound, int upperBound, int key){
            int middle = (lowerBound + upperBound) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (lowerBound > upperBound) {
                return -1;
            } else {
                if (arr[middle] > key) {
                    return search(arr, lowerBound, upperBound - 1, key);
                } else {
                    return search(arr, middle + 1, upperBound, key);
                }

            }

        }

}
