package Sorting;

public class insertionSorting {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j]; // this is for shifting the value for new value
                j--;// j becomes -1
            }
            arr[j + 1] = current;// placign the value at front

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
