package Questionforjava;

import java.util.Scanner;

public class q4 {
    public static float perimeter(float r) {
        float p;
        p = (2 * 22 * r) / 7;
        return p;
    }

    public static void main(String[] args) {
        System.out.println("Eneter the radius");
        Scanner sc = new Scanner(System.in);

        float a = sc.nextInt();

        System.out.println("The Perimeter is " + perimeter(a));
        sc.close();

    }
}
