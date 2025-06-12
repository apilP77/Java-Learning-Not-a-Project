package Array.twod;

import java.util.*;

public class basic {

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
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print(number[i][j] + "\t");
                ;

            }
            System.err.println();

        }
        sc.close();
    }
}
