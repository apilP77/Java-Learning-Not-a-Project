
package Questionforjava;

import java.util.Scanner;

public class q6 {
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return a;
        } else {
            return gcd(b, a % b);

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter two number for finding the gcd");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The output is " + gcd(a, b));
        sc.close();
    }
}
