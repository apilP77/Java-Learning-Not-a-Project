
// some of n natural numbers
package Recursion;

import java.util.Scanner;

public class q3 {

    public static void summ(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        } else {
            sum = sum + n;
            summ(n - 1, sum);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        summ(a, 0);
        sc.close();
    }
}
