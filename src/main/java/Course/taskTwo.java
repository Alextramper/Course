package Course;

import java.util.Scanner;

public class taskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int n = in.nextInt();
        System.out.println("Enter second number");
        int m = in.nextInt();

        if (n < m) {
            for (int i = n; i < m+1; i++) {
                System.out.print(i + " ");
            }
        }
        for (int i = m; i < n+1; i++) {
            System.out.print(i + " ");
        }
    }
}
