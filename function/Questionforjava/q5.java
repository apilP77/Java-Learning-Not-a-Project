package Questionforjava;

import java.util.Scanner;

public class q5 {
    public static int power(int x, int y) {
        int product = 1;
        for (int i = 1; i <= y; i++) {
            product = product * x;
        }
        return product;
    }

    public static void main(String[] args) {
        {
            System.out.println("Enter the base and power of the requied out put");

            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("The output is " + power(a, b));
            sc.close();
        }
    }
}
