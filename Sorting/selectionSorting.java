package Sorting;

public class selectionSorting {
    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[small]) {
                    small = j;// new position for smallest

                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
