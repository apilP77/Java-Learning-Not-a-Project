package Intermediate;

public class q4 {
    public static boolean check(int arr[], int index) {
        if (index != arr.length - 1) {
            if (arr[index] < arr[index + 1]) {
                return check(arr, index + 1);

            } else {
                return false;
            }

        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 5, 9 };
        System.out.println(check(arr, 0));
    }
}
