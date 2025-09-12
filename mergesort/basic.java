package mergesort;

public class basic {
    public static void conqure(int arr[], int str, int mid, int end) {
        int merge[] = new int[end - str + 1];
        int ind1 = str;
        int ind2 = mid + 1;
        int x = 0;
        while (ind1 <= mid && ind2 <= end) {
            if (arr[ind1] < arr[ind2]) {
                merge[x++] = arr[ind1++];
            } else {
                merge[x++] = arr[ind2++];

            }

        }
        while (ind1 <= mid) {
            merge[x++] = arr[ind1++];
        }
        while (ind2 <= end) {
            merge[x++] = arr[ind2++];
        }
        for (int i = 0, j = str; i < merge.length; i++, j++) {
            arr[j] = merge[i];

        }
    }

    public static void arrange(int arr[], int str, int end) {
        if (str >= end) {
            return;
        }
        int mid = (str + end) / 2;
        arrange(arr, str, mid);
        arrange(arr, mid + 1, end);
        conqure(arr, str, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 9, 3, 7 };
        int n = arr.length;
        arrange(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
