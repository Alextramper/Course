package Course;

import java.util.Scanner;

public class taskThree {
public static void main( String[] args) {
    Scanner in = new Scanner(System.in);
    int sum = 0;
    System.out.println("Enter number");
    int n = in.nextInt();

    for (int i = 0; i<n+1; i++) {
        sum += i;
    }
    System.out.println(sum);
}
}
