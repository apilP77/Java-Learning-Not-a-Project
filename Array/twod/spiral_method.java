package Array.twod;

import java.util.Scanner;

public class spiral_method {
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

        // outpit
        int rowstart = 0;
        int rowend = rows - 1;

        int colstart = 0;
        int colend = columns - 1;

        while (rowstart <= rowend && colstart <= colend) {

            for (int col = colstart; col <= colend; col++) {
                System.out.print(number[rowstart][col] + " ");
            }
            rowstart++;

            for (int row = rowstart; row <= rowend; row++) {
                System.out.print(number[row][colend] + " ");
            }
            colend--;

            for (int col = colend; col >= colstart; col--) {
                System.out.print(number[rowend][col] + " ");
            }
            rowend--;
            for (int row = rowend; row >= rowstart; row--) {
                System.out.print(number[row][colstart] + " ");
            }
            colstart++;

            sc.close();

        }
    }
}
