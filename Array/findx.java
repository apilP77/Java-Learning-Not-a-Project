package Array;

import java.util.Scanner;

public class findx {

    public static void main(String[] args) {
        int f = 0;

        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] number = new int[size];

        System.out.println("Enter the all elements");

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Enter the number you wanna serch for");

        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (x == number[i]) {
                System.err.println("number has being found");
                f = 1;
                break;

            }

        }
        if (f == 0) {
            System.out.println("Not found");
        }
    }
}
