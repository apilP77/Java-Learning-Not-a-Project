package Intermediate;

import java.util.HashSet;

public class q6_Imp {
    public static void subSequence(String str, int indx, String newString, HashSet<String> set) {
        if (indx == str.length()) {
            if (set.contains(newString)) {
                return; // Skip duplicate
            } else {
                System.out.println(newString);
                set.add(newString); // Add to set to prevent future duplicates
                return;
            }
        }

        char currChar = str.charAt(indx);
        // Include current character
        subSequence(str, indx + 1, newString + currChar, set);
        // Exclude current character
        subSequence(str, indx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        subSequence(str, 0, "", set);

        System.out.println("\nTotal unique subsequences: " + set.size());
    }
}