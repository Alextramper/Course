package Course;

import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        for (int i=1; i<n+1; i++) {
            System.out.print(i);
        }
    }
}
