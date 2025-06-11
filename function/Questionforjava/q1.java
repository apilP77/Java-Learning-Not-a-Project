package Questionforjava;

import java.util.Scanner;

public class q1 {
    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        System.out.println("Enter 3 numbers ");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("Average is " + avg(x, y, z));
    }
}
