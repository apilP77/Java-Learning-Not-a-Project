package backtracking;

public class q1 {
    public static void perm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);

        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String newString = str.substring(0, i) + str.substring(i + 1, str.length());
            perm(newString, permutation + currChar);

        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        perm(s, "");
    }
}
// time complexity (n*n!)