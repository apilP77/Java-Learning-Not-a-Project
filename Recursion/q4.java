// factorial of n 

package Recursion;

import java.util.Scanner;

public class q4 {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;

        }
        int f = fact(n - 1) * n;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(fact(a));

        sc.close();
    }

}
