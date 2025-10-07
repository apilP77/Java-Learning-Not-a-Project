package quickshot;

public class basicquickshot {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (pivot > arr[j]) {
                i++;// i=-1 than change to i=0
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;// the original array is now chnaged storing the lower value than the pivot

            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;// placed the pivot in the right position
        arr[high] = temp;
        return i;

    }

    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 5, 9, 2, 8 };
        int n = arr.length;
        sort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
