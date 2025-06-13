package bitManupulation;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // if a number is of 2 power or not

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ((n & n - 1) == 0) {// 2= 0010 and 2-1= 0001 the AND is 0 so number is power of 2
            System.out.println("The Number is a power of 2");
        } else {
            System.out.println("The number is not power of 2");
        }
        sc.close();
    }
}
