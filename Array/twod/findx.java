package Array.twod;

import java.util.Scanner;

public class findx {
    public static void main(String[] args) {

        System.out.println("Enter Rows and Columns");

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] number = new int[rows][columns];

        System.out.println("Enter the All the Data");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                number[i][j] = sc.nextInt();

            }

        }
        System.out.println("Enter the number you want to serch");
        int f = sc.nextInt();
        int count = 0;

        // outpit
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                if (number[i][j] == f) {
                    System.out.println("The row and Columns for the number is " + i + "," + j);
                    count = 1;
                } else {

                }

            }

        }
        if (count == 0) {
            System.out.println("Number not found !");

        }
        sc.close();
    }
}
