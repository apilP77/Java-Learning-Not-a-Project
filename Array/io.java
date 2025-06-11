package Array;

import java.util.Scanner;

public class io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.println("enter " + size + "inputs");

        // inputs
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }
        // outputs
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);

        }
    }
}
