package adavnce;

import java.util.ArrayList;

public class q5 {

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void subSetCount(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }

        // Include n in the subset
        subset.add(n);
        subSetCount(n - 1, subset);

        // Backtrack: remove the last added element
        subset.remove(subset.size() - 1);
        subSetCount(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        subSetCount(n, subset);
    }
}
