package Questionforjava;

import java.util.Scanner;

public class q7 {
    public static int fibo(int a) {
        if (a == 1 || a == 0) {
            return 1;

        } else {
            return fibo(a - 1) + fibo(a - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + "");
        }
    }
}
