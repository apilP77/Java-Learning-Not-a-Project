// from 1 to n

package basic;

import java.util.Scanner;

public class q2 {
    public static void prt(int n) {

        if (n == 0) {
            return;
        }

        prt(n - 1);
        System.out.println(n);// using the stack method
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        prt(a);
        sc.close();
    }
}
