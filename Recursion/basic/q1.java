package basic;

import java.util.Scanner;

public class q1 {
    public static void prt(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        prt(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        prt(a);
        sc.close();
    }
}