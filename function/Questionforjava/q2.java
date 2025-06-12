package Questionforjava;

import java.util.Scanner;

public class q2 {
    public static int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 2) != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Enter A number");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("the sum of odd " + sumOdd(a));
        sc.close();
    }
}
