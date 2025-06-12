package Questionforjava;

import java.util.Scanner;

public class qe {
    public static int compare(int a, int b) {
        if (a > b) {
            return a;

        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter Two number ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("The Graetest is " + compare(a, b));
        sc.close();
    }
}
