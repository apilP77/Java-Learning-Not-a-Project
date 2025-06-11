package Array;

import java.util.Scanner;

public class javaInitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] mark = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(mark[i]);
            // java intilize empty array set as 0
        }
    }
}
