package Sorting;

public class bubbleSorting {
    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {// subtarctinf i becuase the i number elements are already
                                                          // sorted
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
